# Engineering Notes - Group Anagrams

## Core Insight

Thay vì so sánh từng cặp string (`O(N²)`), hãy biến mỗi string thành một **signature** sao cho mọi anagram có cùng signature, rồi dùng `HashMap<Signature, List<String>>` để gom nhóm.

---

## Ý tưởng

- Đếm tần suất xuất hiện của 26 ký tự (`int[26]`).
- Signature = biểu diễn duy nhất của mảng tần suất.
- `HashMap` sẽ tự nhóm các string có cùng signature.

---

## Pattern nhận diện

**Dấu hiệu nên nghĩ đến "Signature + HashMap":**

- Cần **group** hoặc **classify** dữ liệu.
- Hai object được coi là giống nhau nếu có cùng một đặc trưng (canonical representation).
- Có thể biến object phức tạp thành một key để tra cứu nhanh.

---

## Trade-off

| Solution | Ưu điểm | Nhược điểm |
|----------|----------|------------|
| `String key = Arrays.toString(int[])` | Nhanh, ít object, không boxing | Phải convert mảng thành `String` |
| `List<Integer>` làm key | Tận dụng `List.equals()` và `hashCode()` | Boxing/Unboxing nhiều, tốn bộ nhớ, chậm hơn |

> **Engineering choice:** ưu tiên `int[]` + encode thành key (String hoặc custom encoding) vì tối ưu hơn về hiệu năng và bộ nhớ.

---

## Liên hệ thực tế

Ý tưởng **Canonical Representation (Signature)** xuất hiện rất nhiều trong backend:

- **Redis Cache:** tạo cache key từ request (`user:123:orders:page=1`).
- **Database:** tạo composite key từ nhiều cột để định danh bản ghi.
- **API Gateway:** normalize URL/query trước khi cache.
- **Distributed Systems:** hash cùng một request về cùng một key để chống xử lý trùng (idempotency).
- **HashMap/HashSet:** mọi key đều cần một "signature" thông qua `hashCode()` và `equals()`.