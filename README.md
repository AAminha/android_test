# android_test
소프트웨어 프로젝트 안드로이드 앱 틀 만들기

기본 형식은 Bottom Navigation Activity로 진행

### 1. 내비게이션을 통한 화면 전환
- 각각의 화면에 대한 fragment 생성 (Home을 제외한 두가지의 기능은 완성하지 않음)
- MainActivity.java에서 어떤 내비게이션이 선택되었는지를 확인하기 위한 클래스 및 메소드 생성
- 각 item마다 id로 구분하여 화면 전환

### 2. RecyclerView를 이용해 반복적으로 리스트 생성
- xml에 반복적으로 리스트를 표현하는 것이 아니라고 생각. 재사용할 방법 조사
- RecyclerView를 통해 반복적으로 형식을 이용해서 리스트 생성 가능.
- RecyclerView에서 사용 가능한 setLayoutManager와 LinearLayoutManager를 통해 따로 스크롤뷰 생성없이 스크롤 환경 가능.
- 공부가 부족했기에 추가적으로 더 하면 좋을 것 같음.
- 참고한 사이트 [링크1](https://lakue.tistory.com/56) / [링크2](https://recipes4dev.tistory.com/154)

### 3. xml 작업 시 헤더부분에 생기는 여백문제
- xml의 제일 바깥부분이 constraintlayout이여서 발생한 문제.
- LinearLayout이나 RelativeLayout이면 해결 가능.

### 4. Glide 라이브러리 이용
- 중간발표 때 사용하겠다고 이야기했어서 사용 도전
- 기본적으로 사용할 이미지를 소유하고 있으면 큰 메리트는 없는 것으로 판단
- 인터넷 링크를 통한 방법으로는 유용할 수 있다고 생각
