# Engineering Notes - Products of Array Except Self

## Core Insight
- Đi từ **Brute Force → tìm tính toán lặp (redundant computation) → Precompute/Cache → Prefix/Suffix**.
- Prefix/Suffix không phải mục tiêu, mà là **một cách cache kết quả trung gian** để tránh tính lại.

## Ý tưởng
- `left[i]`: tích của tất cả phần tử đứng trước `i`.
- `right[i]`: tích của tất cả phần tử đứng sau `i`.
- `answer[i] = left[i] × right[i]`.

## Pattern nhận diện

### Cây tư duy chung khi tối ưu thuật toán

```text
Brute Force
      │
      ▼
Có đang tính lại thứ gì không?
      │
      ├── Không → Tìm hướng khác
      │
      └── Có
            │
            ▼
Có thể cache kết quả trung gian không?
            │
            ├── Cache theo key → HashMap
            ├── Cache theo vị trí → Prefix / Suffix
            ├── Cache theo trạng thái → Dynamic Programming
            ├── Cache theo tần suất → Bucket
            └── ...
```

### Áp dụng cho bài này

```text
Brute Force
      ↓
Mỗi index đều nhân lại gần như toàn bộ mảng
      ↓
Có phép tính lặp
      ↓
Cache tích bên trái và bên phải
      ↓
Prefix Product + Suffix Product
```

**Dấu hiệu nhận biết Prefix/Suffix**
- Mỗi vị trí cần thông tin tích lũy từ bên trái, bên phải hoặc cả hai.
- Có thể xây dựng kết quả hiện tại từ kết quả của vị trí trước/sau (incremental computation).

## Trade-off
- Prefix + Suffix Array:
    - Time: `O(n)`
    - Extra Space: `O(n)`
    - Dễ hiểu, dễ cài đặt.
- Có thể tối ưu xuống `O(1)` extra space bằng cách tái sử dụng `answer[]`.

## Liên hệ thực tế
- **Cùng bản chất với cache**: "Tính một lần, dùng nhiều lần".
- Khác tầng:
    - **Algorithm**: Prefix, Memoization, DP, HashMap → cache trong một lần thực thi.
    - **System**: Redis, Caffeine → cache giữa nhiều request.
- Prefix/Suffix xuất hiện trong:
    - Thống kê doanh thu theo thời gian (Prefix Sum).
    - Time-series analytics.
    - GIS (2D Prefix Sum / Integral Image).
    - Xử lý log và dữ liệu phân tích.

## Điều rút ra
> Khi gặp bài mới, đừng hỏi:
>
> **"Đây có phải Prefix không?"**
>
> Hãy hỏi:
>
> **"Brute Force đang tính lặp điều gì, và mình có thể cache kết quả trung gian theo cách nào?"**
>
> Prefix/Suffix chỉ là **một lựa chọn** trong nhóm các kỹ thuật cache/precompute.