# 프로젝트 구조 소개
JPA와 Docker를 이용하여 게시판  CRUD 기능 구현

# 개발 환경 & 아키텍쳐
spring boot 3.1.2
mysql 
docker 

<img width="611" alt="image" src="https://github.com/YooMyeonggeun/Task-Project/assets/129927506/65e33096-8739-4668-b7e4-ff9259565664">

mysql를 docker 컨테이너 안에 띄워 놓고 spring boot에서 요청해서 값을 가져오는 방식으로 아키텍처를 구현하였습니다



# 빌드 & 실행 방법
zip 파일 압축해제 하시고 PostMan으로 신호를 보내시면 됩니다 

## 전체조회
<img width="712" alt="image" src="https://github.com/YooMyeonggeun/Task-Project/assets/129927506/430afa86-2c40-46ea-9bbd-c277f790554f">


## 단건조회 (단건조회를 해야한다고 해서 sql문에 like를 넣지 않았습니다)
<img width="665" alt="image" src="https://github.com/YooMyeonggeun/Task-Project/assets/129927506/b5603396-b7b4-417a-81d1-9b3c504ea1a0">


## 게시판 등록
<img width="1152" alt="등록" src="https://github.com/YooMyeonggeun/Task-Project/assets/129927506/a0771e6b-63d9-4c65-a319-ab0468b3d45c">
<img width="668" alt="image" src="https://github.com/YooMyeonggeun/Task-Project/assets/129927506/00ecce23-29c7-4da3-9bd9-a0a7e0cd9a0a">


## 게시판 수정
<img width="1152" alt="등록" src="https://github.com/YooMyeonggeun/Task-Project/assets/129927506/a0771e6b-63d9-4c65-a319-ab0468b3d45c">
<img width="677" alt="image" src="https://github.com/YooMyeonggeun/Task-Project/assets/129927506/d62add70-4d92-4637-9bf9-ea9175f81337">


## 게시판 삭제
<img width="1152" alt="등록" src="https://github.com/YooMyeonggeun/Task-Project/assets/129927506/a0771e6b-63d9-4c65-a319-ab0468b3d45c">
<img width="674" alt="image" src="https://github.com/YooMyeonggeun/Task-Project/assets/129927506/fb4193a2-918b-480e-b4e5-3b0c0e2299e7">


