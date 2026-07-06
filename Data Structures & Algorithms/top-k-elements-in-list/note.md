# Engineering Notes - Top K Frequent Elements (Bucket Sort)

## Core Insight

- Sau khi dùng `HashMap` để đếm tần suất, bài toán không còn là xử lý mảng nữa mà là tìm **Top K key theo frequency**.
- Nếu `frequency` chỉ nằm trong khoảng `1...n`, có thể dùng chính `frequency` làm **index** thay vì phải sort.

---

## Ý tưởng

1. Dùng `HashMap<Integer, Integer>` để đếm số lần xuất hiện.
2. Tạo `bucket` với:
   ```java
   List<Integer>[] buckets = new ArrayList[nums.length + 1];
   ```
3. `buckets[f]` chứa **tất cả các số xuất hiện đúng `f` lần**.
4. Duyệt bucket từ `n -> 1`, lấy lần lượt các số cho đến khi đủ `k`.

---

## Pattern nhận diện

### Khi nào nghĩ đến Bucket?

- Không được dùng `O(n log n)` (sort).
- Giá trị cần phân loại nằm trong khoảng hữu hạn nhỏ.
    - `frequency ∈ [1, n]`
    - `score ∈ [0,100]`
    - `age ∈ [0,150]`
    - `ASCII ∈ [0,255]`
- Không cần sắp xếp các phần tử bên trong cùng một bucket.

**Dấu hiệu quan trọng:**

> Nếu một thuộc tính chỉ nhận giá trị trong một khoảng nhỏ, hãy nghĩ đến việc dùng chính giá trị đó làm index.

---

## Trade-off

### Bucket Sort

- Time: **O(n)**
- Space: **O(n)**

Ưu điểm:
- Đạt yêu cầu tối ưu của đề.
- Không cần sort.

Nhược điểm:
- Chỉ áp dụng khi miền giá trị của thuộc tính nhỏ và biết trước.

---

### Sort

- Time: **O(n log n)**
- Dễ nghĩ nhất nhưng không đạt yêu cầu đề.

---

### PriorityQueue (Heap)

- Time: **O(n log k)**
- Tổng quát hơn Bucket.
- Dùng khi không thể bucket hóa dữ liệu.

---

## Liên hệ thực tế

Bucket không chỉ là thuật toán sắp xếp mà là kỹ thuật **group theo một thuộc tính hữu hạn**.

Ví dụ:

- Phân nhóm log HTTP theo status code.
- Thống kê người dùng theo độ tuổi.
- Histogram trong monitoring.
- Đếm tần suất từ khóa tìm kiếm.
- Gom dữ liệu theo khoảng điểm hoặc mức ưu tiên.

---

## Điều rút ra

Đừng cố nhớ:

> "LeetCode 347 dùng Bucket."

Hãy nhớ pattern:

> **Nếu thuộc tính cần xử lý chỉ nằm trong một khoảng hữu hạn nhỏ ⇒ cân nhắc dùng chính giá trị đó làm index thay vì sort.**