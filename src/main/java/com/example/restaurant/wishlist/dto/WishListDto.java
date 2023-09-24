package com.example.restaurant.wishlist.dto;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// 분리시키는 이유는, Database Entity가 바뀌면 frontend Dto에도 영향이 미친다. 
// 그게 아니라 중간에 변환하는 과정만 있으면 되니깐 별도로 분리했다...  -----> TODO 공부
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WishListDto {
  
  private Integer index;
  private String title;                 // 음식명, 장소명
  private String category;              // 카테고리
  private String address;               // 주소
  private String roadAddress;           // 도로명
  private String homePageLink;          // 홈페이지 주소
  private String imageLink;             // 음식, 가게 이미지 주소
  private boolean isVisit;              // 방문여부
  private int visitCount;               // 방문 카운트
  private LocalDateTime lastVisitDate;  // 마지막 방문일자

}
