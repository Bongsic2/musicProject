# LineNo5

## Server Package
  * Server.java 
  
    : 서버 실행시 python_MH폴더에 있는 랜덤 파일 하나 보낼준비
  * Client.java
  
    : 클라이언트 실행 시 서버에서 파일 하나 받음
      재생 프레임이 나오고 재생 버튼을 누르면 받은 파일재생
  * Receiver.java

    : 파일 수신 구현 클래스
  * FileSender.java

    : 파일 송신 구현 클래스
  * MusicOne.java

    : 음악 재생 클래스
  * Player.java

    : 클라이언트 프레임창
    
    
## Youtube Package
  * ReadTxt.java 

    : 정보가 저장된 txt파일을 불러와서 리스트로 저장
  * Wav.java

    : 음악 재생 클래스(연습)
  * WavPlayer.java

    : 음악 재생, 멈춤, 리셋 구현 클래스(연습)
  * YoutubeFrame.java

    : 음악 재생 프레임창(연습)

### 개선사항
  * 서버에서 음악파일 중복없이 랜덤으로 N개 클라이언트에 보내기
  * 클라이언트 닫으면 받아온 음악파일들 삭제
  * 음악 파일 1초 3초 나눠서 저장되게 구현


# 2022_01_28까지 작업한 GUI
## 1. 메인화면
![01](https://user-images.githubusercontent.com/76654360/151514062-cec0e935-dec5-4767-bb2e-a54ebca71ad8.jpg)
  * 플레이버튼 클릭시 다음 화면으로 넘어감

## 2. 선택화면
![02](https://user-images.githubusercontent.com/76654360/151514145-558a90bb-3182-4ed4-b84e-18d69086f530.jpg)
  * 싱글 플레이 난이도 3개와 멀티 플레이 선택화면

## 3. 싱글 게임 화면(구현중)
![03](https://user-images.githubusercontent.com/76654360/151514278-a55fa0a8-f6db-450c-b053-d35aba54c337.jpg)


    
# 2022_02_03 수정사항
 * 갑작스럽게 파이썬 pytube가 오류뜨면서 작동이 안됨 ('nonetype' object has no attribute 'span')
 * List.txt에 있는 링크를 따로 mp3형식으로 하나씩 저장 -> 파이썬으로 1초 5초 10초로 각각 폴더 나누어서 저장
 * 추후 음악 추가시, List.txt에 링크, 제목, 가수 적고 mp3파일을 따로 다운로드받은 후 파이썬 파일 실행하면 각각 폴더에 저장됨.
 * 싱글 게임 화면을 따로 프레임 생성
