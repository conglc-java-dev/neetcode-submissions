# Engineering Notes - Is Subsequence (LeetCode 392)

## Core Insight

Không bắt đầu bằng câu hỏi:

> "Đây có phải Two Pointers không?"

Mà bắt đầu bằng:

> **Có bao nhiêu trạng thái (state) cần theo dõi đồng thời?**

Bài này có 2 state:

* `p1`: đã match đến ký tự thứ mấy của `s`
* `p2`: đang đọc đến ký tự nào của `t`

Mỗi state chỉ **tiến**, không bao giờ lùi.

→ Two Pointers trên **hai sequences**.

---

## Ý tưởng

* Duyệt `t` từ trái sang phải.
* Nếu `t[p2] == s[p1]` → match thành công, `p1++`.
* Dù match hay không, `p2` luôn tăng.
* Khi `p1 == s.length()` nghĩa là đã match toàn bộ `s`.

```java
while (p1 < s.length() && p2 < t.length()) {
    if (s.charAt(p1) == t.charAt(p2)) {
        p1++;
    }
    p2++;
}

return p1 == s.length();
```

---

## Pattern nhận diện

### Khi nào nghĩ đến Two Pointers?

Đừng nhìn số lượng pointer.

Hãy nhìn số lượng **state**.

### Dấu hiệu

* Có 2 đối tượng cần theo dõi (2 array, 2 string, 2 list,...)
* Mỗi đối tượng có một vị trí hiện tại.
* Các vị trí chỉ tiến, không quay lui.
* Mỗi phần tử chỉ cần xử lý một lần.

### Các biến thể

| Pattern            | Dấu hiệu                           |
| ------------------ | ---------------------------------- |
| Opposite Direction | Left ↔ Right trên cùng một dãy     |
| Fast & Slow        | Một pointer đọc, một pointer ghi   |
| Sliding Window     | Left + Right tạo cửa sổ            |
| Two Sequences      | Mỗi pointer trên một dãy (bài này) |

---

## Trade-off

### Brute Force

* Với mỗi ký tự của `s` quét lại `t`
* Time: `O(|s| × |t|)`

### Two Pointers

* Mỗi pointer đi đúng một lần
* Time: `O(|s| + |t|)` (thường viết `O(|t|)` khi `|t|` lớn hơn nhiều)
* Space: `O(1)`

---

## Engineering Insights

### 1. Pointer biểu diễn **state**, không chỉ là index

Không nghĩ:

```text
p1 là con trỏ.
```

Mà nghĩ:

```text
p1 = số ký tự của s đã được match.
```

Khi đó điều kiện kết thúc trở nên tự nhiên:

```java
return p1 == s.length();
```

---

### 2. Điều kiện dừng phải đúng business logic

Sai:

```java
p1 == s.length() - 1
```

Đúng:

```java
p1 == s.length()
```

Vì:

* Đứng ở ký tự cuối ≠ Đã match ký tự cuối.

---

### 3. Đưa điều kiện dừng vào `while`

Thay vì kiểm tra nhiều lần trong vòng lặp:

```java
if (...) return true;
```

Hãy để `while` mô tả chính xác khi nào còn phải làm việc:

```java
while (p1 < s.length() && p2 < t.length())
```

Cuối hàm chỉ cần:

```java
return p1 == s.length();
```

---

### 4. Phân biệt tối ưu thuật toán và micro-optimization

Các thay đổi như:

* `charAt()` ↔ `toCharArray()`
* lưu `length()` vào biến

chỉ là **micro-optimization**, không thay đổi Big-O.

Ưu tiên:

1. Thuật toán.
2. Cấu trúc điều khiển.
3. Micro-optimization (nếu profiling chứng minh cần).

---

## Liên hệ thực tế

### Merge Join (Database)

Hai bảng đã sort:

```
Table A ---> p1
Table B ---> p2
```

Database dùng hai pointer để đọc đồng thời.

→ `O(m + n)`.

---

### Stream Parser

Parser (HTTP, CSV, JSON...) thường có:

* Một state biểu diễn đã parse đến đâu.
* Một state biểu diễn đang đọc đến đâu.

Đều là tư duy **đọc một chiều, không quay lui**, giống hệt bài này.
