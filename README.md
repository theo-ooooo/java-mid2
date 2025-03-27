# 📘 김영한의 실전 자바 - 중급 2편 학습 정리

## ✅ 진행 현황

- [x] **1. 제네릭 (Generic)**
- [x] **2. 컬렉션 프레임워크 - ArrayList**
- [x] **3. 컬렉션 프레임워크 - LinkedList**
- [x] **4. 컬렉션 프레임워크 - List (ArrayList, LinkedList 부모)**
- [x] **5. 컬렉션 프레임워크 - Hash**
- [x] **6. 컬렉션 프레임워크 - HashSet**
- [x] **7. 컬렉션 프레임워크 - Set**
- [x] **8. 컬렉션 프레임워크 - Map, Stack, Queue**
- [x] **9. 컬렉션 프레임워크 - 순회, 정렬**

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

### 7. Set 인터페이스
- **중복 없는 데이터 집합** 표현
- 순서 미보장 (`HashSet`), 삽입 순서 유지 (`LinkedHashSet`), 정렬 (`TreeSet`)
- 주요 메서드:
    - `add(element)`: 요소 추가
    - `remove(element)`: 요소 제거
    - `contains(element)`: 포함 여부 확인
    - `iterator()`: 반복자 반환

#### 🔁 컬렉션 간 연산 메서드
- `addAll(Collection c)`: 두 컬렉션의 합집합
- `removeAll(Collection c)`: 차집합 (현재 컬렉션에서 c에 포함된 요소 제거)
- `retainAll(Collection c)`: 교집합 (현재 컬렉션에서 c에 **포함되지 않은 요소 제거**)

> ☑️ Set 연산처럼 사용할 수 있어 컬렉션 비교/조작에 매우 유용

### 8. Map, Stack, Queue

#### 📌 Map
- **Key-Value 쌍**으로 데이터 저장
- 중복 키 ❌, 값은 중복 가능
- 주요 구현체: `HashMap`, `LinkedHashMap`, `TreeMap`
- 주요 메서드:
  - `put(key, value)`, `get(key)`, `remove(key)`, `containsKey(key)`, `keySet()`, `values()`

---

#### 📌 Stack (LIFO)
- **후입선출 (Last In First Out)** 구조
- 전통적으로 `Stack` 클래스를 사용했지만, 현재는 **`Deque`의 `ArrayDeque` 사용을 권장**
- `Stack` 클래스는 `Vector`를 상속하고 있어 **성능/동기화 이슈**가 있음

> ✅ 권장 방식:
> ```java
> Deque<Integer> stack = new ArrayDeque<>();
> stack.push(1);      // 삽입
> stack.pop();        // 제거
> stack.peek();       // 조회
> ```

---

#### 📌 Queue (FIFO)
- **선입선출 (First In First Out)** 구조
- 주요 메서드:
  - `offer()`: 데이터 추가
  - `poll()`: 데이터 제거 및 반환
  - `peek()`: 가장 앞의 데이터 확인
- 구현체: `LinkedList`, `ArrayDeque`, `PriorityQueue`

---

#### 📌 Deque (Double-Ended Queue)
- **양방향으로 삽입/삭제가 가능한 큐**
- Stack, Queue 역할 모두 수행 가능
- 구현체: `ArrayDeque` (가장 널리 사용됨)
- 주요 메서드:
  - Stack처럼: `push()`, `pop()`, `peek()`
  - Queue처럼: `offerFirst()`, `offerLast()`, `pollFirst()`, `pollLast()`

> 🔥 실무에서는 `ArrayDeque`로 **Stack & Queue 모두 대체**하는 것이 일반적

### 9. 순회 & 정렬

컬렉션을 다루는 데 있어 **순회(Iteration)**와 **정렬(Sorting)**은 필수적인 핵심 개념입니다.

---

#### 🔁 순회 (Iteration)

- **기본 for 루프**
  ```java
  for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
  }
  ```

- **향상된 for-each 루프**
  ```java
  for (String item : list) {
      System.out.println(item);
  }
  ```

- **Iterator**
  - 모든 `Collection`에서 사용 가능
  - `remove()`를 통해 안전하게 요소 제거 가능
  ```java
  Iterator<String> it = list.iterator();
  while (it.hasNext()) {
      System.out.println(it.next());
  }
  ```

---

#### 🔀 정렬 (Sorting)

- **오름차순 정렬**
  ```java
  Collections.sort(list);
  ```

- **내림차순 정렬 (익명 클래스 사용)**
  ```java
  Collections.sort(list, new Comparator<Integer>() {
      @Override
      public int compare(Integer a, Integer b) {
          return b - a;
      }
  });
  ```

- **Comparable 인터페이스**
  - 객체 자신이 비교 기준을 갖도록 구현
  ```java
  class Person implements Comparable<Person> {
      int age;

      @Override
      public int compareTo(Person other) {
          return this.age - other.age; // 오름차순
      }
  }
  ```

- **Comparator 인터페이스**
  - 외부에서 정렬 기준을 지정
  ```java
  class NameComparator implements Comparator<Person> {
      @Override
      public int compare(Person a, Person b) {
          return a.name.compareTo(b.name);
      }
  }

  Collections.sort(personList, new NameComparator());
  ```




---
