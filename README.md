# 📘 김영한의 실전 자바 - 중급 2편 학습 정리

## ✅ 진행 현황

- [x] **1. 제네릭 (Generic)**
- [x] **2. 컬렉션 프레임워크 - ArrayList**
- [x] **3. 컬렉션 프레임워크 - LinkedList**
- [x] **4. 컬렉션 프레임워크 - List (ArrayList, LinkedList 부모)**
- [x] **5. 컬렉션 프레임워크 - Hash**
- [x] **6. 컬렉션 프레임워크 - HashSet**
- [ ] **7. 컬렉션 프레임워크 - Set**
- [ ] **8. 컬렉션 프레임워크 - Map, Stack, Queue**
- [ ] **9. 컬렉션 프레임워크 - 순회, 정렬**

---

## 📂 학습 내용 요약

### 1. 제네릭 (Generic)
- 타입을 파라미터화하여 **유연하고 재사용 가능한 코드** 작성 가능
- `List<String>`, `Map<K, V>` 등 타입 안정성 제공
- 타입 매개변수 예: `T`, `E`, `K`, `V`

### 2. ArrayList
- 내부적으로 **배열 기반** 구현
- 인덱스 접근이 빠름
- 삽입/삭제 시 비용 발생 (중간 요소 이동 필요)

### 3. LinkedList
- **노드 기반** 자료구조 (prev, next 링크)
- 삽입/삭제에 유리
- 인덱스 접근은 느림 (순차 탐색)

### 4. List 인터페이스
- 순서를 유지하며 중복 허용
- 주요 구현체: `ArrayList`, `LinkedList`
- 메서드: `add()`, `remove()`, `get()`, `size()`, `contains()`

### 5. Hash
- **해시 함수**를 통해 빠른 검색/저장 제공
- `hashCode()`와 `equals()` 구현 중요

### 6. HashSet
- 중복 허용하지 않음
- 내부적으로 `HashMap` 사용
- 순서를 보장하지 않음

---
