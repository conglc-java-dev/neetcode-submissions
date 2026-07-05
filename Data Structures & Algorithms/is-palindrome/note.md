# Engineering Notes — LeetCode 125: Valid Palindrome

## Core Insight

> **Nếu chỉ cần đọc và so sánh dữ liệu thì đừng tạo dữ liệu mới.**

Thay vì:

```
String
    ↓
toLowerCase()
    ↓
replaceAll()
    ↓
char[]
    ↓
Two Pointers
```

Hãy dùng **Two Pointers** trực tiếp trên chuỗi gốc:

```
left → String ← right

- Ký tự không hợp lệ → bỏ qua
- Ký tự hợp lệ → so sánh
```

⇒ Không cần copy dữ liệu → **O(1) Space**

---

## Ý tưởng

- Dùng hai con trỏ `left` và `right`.
- Bỏ qua các ký tự không phải chữ hoặc số (`Character.isLetterOrDigit()`).
- So sánh hai ký tự sau khi chuyển về cùng kiểu chữ (`Character.toLowerCase()`).
- Khác nhau → `false`, duyệt hết → `true`.

---

## Pattern nhận diện

**Dấu hiệu:**

- So sánh hai đầu của chuỗi/mảng.
- Kiểm tra tính đối xứng (Palindrome).
- Có thể bỏ qua một số phần tử khi duyệt.
- Không cần thay đổi dữ liệu gốc.

⇒ Nghĩ đến **Two Pointers**.

---

## Trade-off

| Cách | Time | Space |
|------|------|------|
| `replaceAll()` + `char[]` | O(n) | O(n) |
| `StringBuilder + reverse()` | O(n) | O(n) |
| **Two Pointers trực tiếp** | **O(n)** | **O(1)** ✅ |

---

## API cần nhớ

```java
Character.isLetterOrDigit(c)
```

```java
Character.toLowerCase(c)
```

```java
s.charAt(i)
```

---

## Liên hệ thực tế

Tư duy này xuất hiện rất nhiều trong Backend:

- Streaming file
- Database Cursor
- Kafka Consumer
- HTTP Request Parsing

> **Process dữ liệu trực tiếp (in-place) thay vì copy rồi mới xử lý.**