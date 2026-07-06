# Two Sum

## Core Insight
Bản chất bài toán không phải là tìm 2 số có tổng bằng `target`, mà là:

> Với mỗi `nums[i]`, cần kiểm tra thật nhanh xem `target - nums[i]` đã xuất hiện trước đó chưa.

Muốn làm được điều này trong `O(1)` thì dùng **HashMap**.

---

## Ý tưởng

- Duyệt mảng từ trái sang phải.
- Tính `complement = target - nums[i]`.
- Nếu `complement` đã có trong `HashMap` → trả về 2 index.
- Nếu chưa có → lưu `nums[i] -> index` vào `HashMap`.

**Lưu ý:** Luôn **check trước, put sau** để tránh ghép một phần tử với chính nó (ví dụ `[5,5]`).

---

## Vì sao lưu `nums[i]` mà không lưu `complement`?

HashMap nên lưu **Facts (dữ liệu gốc)**:

```text
2 -> 0
7 -> 1
11 -> 2
```

Không nên lưu dữ liệu suy diễn:

```text
7 -> 0
2 -> 1
-2 -> 2
```

> **Nguyên tắc:** Data Structure nên lưu dữ liệu gốc, còn dữ liệu suy diễn thì tính khi cần.

---

## Pattern nhận diện

Khi đề có các dấu hiệu:

- Lookup nhiều lần
- Kiểm tra tồn tại
- Pair Sum
- Complement

→ Nghĩ đến **HashMap**.

---

## Complexity

- Time: **O(n)**
- Space: **O(n)**

---

## Trade-off

- Ưu điểm: Lookup trung bình `O(1)`, chỉ cần duyệt một lần.
- Nhược điểm: Tốn thêm bộ nhớ `O(n)`.

---

## Liên hệ thực tế

Ý tưởng tương tự:

- Cache (`key -> value`)
- Redis
- Session
- Database Index

Mục tiêu đều là biến việc tra cứu từ `O(n)` thành gần `O(1)`.