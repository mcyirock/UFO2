package io.gdc.ufo.ufo2.fragment.VO;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kay on 7/14/16.
 */
public class Event_VO {

    public Event_VO(String para){
        if(para.equals("dano")){
            this.title = "강릉단오제";
            this.logo = "@drawable/logo_fev1";
            this.main_image = "@drawable/fev1_02";
            this.event_date = "2016.06.05 ~ 2016.06.12";
            this.event_long_description = "강릉에서 단오는 큰 명절이다. 단오를 중심으로 8일간의 축제, 그 속에서 펼쳐지는 신과 인간의 소통은 자연과 인간, 인간과 인간의 상생을 위한 휴먼드라마이다.";
            this.event_short_description = "단오를 중심으로 8일간의 축제";
            this.info_info_pic = "@drawable/fev1_03";
            this.info_info_text = "강릉에서 단오는 큰 명절이다. 단오를 중심으로 8일간의 축제, 그 속에서 펼쳐지는 신과 인간의 소통은 자연과 인간, 인간과 인간의 상생을 위한 휴먼드라마이다.";
            this.info_hist_pic = "@drawable/fev1_04";
            this.info_hist_text = "문화적 침탈을 일삼았던 일제강점기에도 단오제는 열렸고, 중요한 기록을 남겼다. 한국전쟁 중에도 단오제는 맥을 이어왔다. 노인들과 무녀들은 시기적으로 어려울 때는 압박의 눈을 피해 중앙시장이나 남대천 변, 성남동 한구석에서 소규모로 나마 빼놓지 않고 단오제를 치뤘다고 증언한다. 이처럼 강릉단오제는 비교적 온전히 전승되고 있거나 고증을 통하여 원형 복원이 가능할 만큼 면면히 이어지고 있었다는 것이다. 이런 덕분에 강릉단오제는 1967년 중요무형문화제 13호로 등록되면서 우리민족 전통 민속축제의 원형성을 간직한 단오축제로서 고유의 가치를 획득하였다. 2005년 11월에는 유네스코가 지정하는 인류구전 및 무형 유산 걸작으로 등재되어 전 세계의 인류가 보존해야 할 문화유산이 되었다.";
            this.info_program_pic = "@drawable/fev1_05";
            this.info_program_text = "프로그램 텍스트";
            this.info_program_text = "<head><style>caption{background-color: #8ee8dd;font-size:120%;}table, th, td {border: 1px solid #8ee8dd;border-collapse: collapse;}th, td {padding: 5px;text-align: left;}</style></head><body><table style=\"width:100%\"><caption>2016.08.09</caption><tr><th>시간</th><th>프로그램</th></tr><tr><td>10:00</td><td>부에나 비스타 소셜 클럽</td></tr><tr><td>13:00</td><td>어둠속의 댄서</td></tr><tr><td>15:00</td><td>먹보쟁이 점</td></tr><tr><td>17:00</td><td>마음소리</td></tr></table><br/><table style=\"width:100%\"><caption>2016.08.10</caption><tr><th>시간</th><th>프로그램</th></tr><tr><td>10:00</td><td>부에나 비스타 소셜 클럽</td></tr><tr><td>13:00</td><td>어둠속의 댄서</td></tr><tr><td>15:00</td><td>먹보쟁이 점</td></tr><tr><td>17:00</td><td>마음소리</td></tr></table><br/><table style=\"width:100%\"><caption>2016.08.11</caption><tr><th>시간</th><th>프로그램</th></tr><tr><td>10:00</td><td>부에나 비스타 소셜 클럽</td></tr><tr><td>13:00</td><td>어둠속의 댄서</td></tr><tr><td>15:00</td><td>먹보쟁이 점</td></tr><tr><td>17:00</td><td>마음소리</td></tr></table></body><img src='http://img.naver.net/static/www/u/2013/0731/nmms_224940510.gif'";

            this.info_location_pic = "@drawable/fev1_06";
            this.info_location_text = "강원도 강릉시 단오장길 1 (노암동 722-2) 강릉단오문화관";
            this.info_contact_pic = "@drawable/fev1_07";
            this.info_contact_text = "전화 033-641-1593\\n" +
                    "팩스 033-646-1595\\n" +
                    "이메일 faq@danofest.com";
            Notice_VO n1 = new Notice_VO();
            Notice_VO n2 = new Notice_VO();
            Notice_VO n3 = new Notice_VO();
            Notice_VO n4 = new Notice_VO();
            Notice_VO n5 = new Notice_VO();
            Notice_VO n6 = new Notice_VO();
            Notice_VO n7 = new Notice_VO();
            Notice_VO n8 = new Notice_VO();
            Notice_VO n9 = new Notice_VO();
            Notice_VO n10 = new Notice_VO();


            n1.setTitle("2016 강릉단오제 민속놀이 대진표(각 읍 면 동 참고)");
            n1.setContent("민속놀이 대진표 좋은 대진운을 위해서는 여러분이 열심히 해주셔야 됩니다. 그렇지 않으면 혼나요.");
            n1.setCreatedBy("단오제위원회");
            n1.setDate("2016. 06. 01 09:24");

            n2.setTitle("2016 강릉단오제 단오해설사 활동가능 시간표");
            n2.setContent("2016 강릉단오제 단오해설사 활동가능 시간표 의 내용이 나옵니다");
            n2.setCreatedBy("단오제위원회");
            n2.setDate("2016. 05. 12 14:22");

            n3.setTitle("2016 강릉단오제 재보조사업자 정산 교육자료 및 양식");
            n3.setContent("2016 강릉단오제 재보조사업자 정산 교육자료 및 양식 의 내용이 나옵니다");
            n3.setCreatedBy("단오제위원회");
            n3.setDate("2016. 05. 12 13:47");

            n4.setTitle("2016 강릉단오제 신주빚기 행사안내");
            n4.setContent("2016 강릉단오제 신주빚기 행사안내 의 내용이 나옵니다");
            n4.setCreatedBy("단오제위원회");
            n4.setDate("2016. 05. 24 19:24");

            n5.setTitle("2016 강릉단오제 통역봉사자 모집공고");
            n5.setContent("유네스코 인류무형유산 2016 강릉단오제에서 활약할 책임감 있고 성실한 통역봉사자를 모집하오니 많은 신청 바랍니다. \n" +
                    "* 신청자격: 20세 이상, 영어/일어/중국어 통역이 가능한자 \n" +
                    "* 모집인원: 00명 \n" +
                    "* 모집기간: 2016.5.9(월)~23(월)");
            n5.setCreatedBy("단오제위원회");
            n5.setDate("2016. 05. 10 09:23");

            n6.setTitle("2016 강릉단오제 공짜 단오 투어단 모집");
            n6.setContent("2016 강릉단오제 공짜 단오 투어단 모집 의 내용이 나옵니다");
            n6.setCreatedBy("단오제위원회");
            n6.setDate("2016. 05. 06 13:04");

            n7.setTitle("2016 강릉단오제 단오 서포터즈 선정자 발표");
            n7.setContent("2016 강릉단오제 단오 서포터즈 선정자 발표 의 내용이 나옵니다");
            n7.setCreatedBy("단오제위원회");
            n7.setDate("2016. 04. 27 19:29");

            n8.setTitle("2016 강릉단오제 현수막 기본안");
            n8.setContent("2016 강릉단오제 현수막 기본안 의 내용이 나옵니다");
            n8.setCreatedBy("단오제위원회");
            n8.setDate("2016. 04. 25 17:41");

            n9.setTitle("2016 강릉단오제 신주빚기 체험 참가자 모집안내");
            n9.setContent("2016 강릉단오제 신주빚기 체험 참가자 모집안내 의 내용이 나옵니다");
            n9.setCreatedBy("단오제위원회");
            n9.setDate("2016. 04. 19 17:46");

            n10.setTitle("제22 강릉단오제 사물놀이 경연대회 참가안내");
            n10.setContent("2016 강릉단오제 공짜 단오 투어단 모집 의 내용이 나옵니다");
            n10.setCreatedBy("단오제위원회");
            n10.setDate("2016. 04. 15 09:48");

            this.noticeList.add(n1);
            this.noticeList.add(n2);
            this.noticeList.add(n3);
            this.noticeList.add(n4);
            this.noticeList.add(n5);
            this.noticeList.add(n6);
            this.noticeList.add(n7);
            this.noticeList.add(n8);
            this.noticeList.add(n9);
            this.noticeList.add(n10);

            this.questions.add(0, "강릉 단오제를 방문한 이유는?");
            this.questions.add(1, "산신제와 대관령국사성황제 등 제사에 쓰일 술을 만드는 행사는?");
            this.questions.add(2, "단오제의 묘미는?");
            this.questions.add(3, "단오제를 누구와 즐기고 있나요?");
            this.questions.add(4, "가장 자신있는 민속놀이는?");
            this.questions.add(5, "단오제를 한단어로 표현한다면?");
            this.questions.add(6, "단오제에서 가장 즐거웠던 순간을 올려주세요.");

            this.q1_option.add(0, "단오제의 의미를 곱씹고 역사적 발자취를 따라서");
            this.q1_option.add(1, "강릉에 놀러왔다가 우연히");
            this.q1_option.add(2, "단오제 행사에 참가자로 참여하게 되어서");
            this.q1_option.add(3, "강릉에 살아서");

            this.q2_option.add(0, "구산서낭제");
            this.q2_option.add(1, "단오굿");
            this.q2_option.add(2, "신주빚기");
            this.q2_option.add(3, "관노 가면극");

            this.q3_option.add(0, "시원한 창포물에 머리감기");
            this.q3_option.add(1, "남대천에 수를 놓는 불꽃놀이 ");
            this.q3_option.add(2, "신명나는 단오굿 ");
            this.q3_option.add(3, "강릉의 명물이 다 모여있는 단오장");

            this.q4_option.add(0, "친구");
            this.q4_option.add(1, "연인");
            this.q4_option.add(2, "가족");
            this.q4_option.add(3, "나는야 솔로부대");

            this.q5_option.add(0, "씨름");
            this.q5_option.add(1, "그네뛰기");
            this.q5_option.add(2, "투호놀이");
            this.q5_option.add(3, "화투");

            this.q1_img = "@drawable/fev2_q1";
            this.q2_img = "@drawable/fev2_q2";
            this.q3_img = "@drawable/fev2_q3";
            this.q4_img = "@drawable/fev2_q4";
            this.q5_img = "@drawable/fev2_q5";
            this.q6_img = "@drawable/fev2_q6";
            this.q7_img = "@drawable/fev2_q7";
            this.q_coupon_img = "@drawable/fev2_coupon";



        }else if(para.equals("coffee")){
            this.title = "커피축제";
            this.logo = "@drawable/fev2_logo";
            this.main_image = "@drawable/fev2_02";
            this.event_date = "2016.09.30 ~ 2016.10.03";
            this.event_long_description = "아침에 눈을 뜨자마자 그라인더에서 풍겨나는 커피향에 취합니다. 향긋한 커피 한잔에  강릉을 담습니다. 설레는 마음으로 강릉커피축제의 여덟 번째 초대를 시작합니다.";
            this.event_short_description = "2016 제 8회 강릉커피축제";
            this.info_info_pic = "@drawable/fev2_03";
            this.info_info_text = "아침에 눈을 뜨자마자 그라인더에서 풍겨나는 커피향에 취합니다. 향긋한 커피 한잔에  강릉을 담습니다. 설레는 마음으로 강릉커피축제의 여덟 번째 초대를 시작합니다.";
            this.info_hist_pic = "@drawable/fev2_04";
            this.info_hist_text = "강릉과 커피는 어떤 관계가 있을까?지역축제에서 커피축제는 어떤 의미를 가질까? 축제란 무엇이길래 사람들이 그토록 열정적으로 대할까? 커피축제는 과연 효용가치가 있는 걸까? 있다면 어떤 효용가치를 가질까? 축제를 마주하면서 처음 가지게 되는 궁금증들이다. 축제에 참가하면서 기본적으로 이와 같은 축제의 기본틀과 지역문화의 폭넓은 이해를 가지고 대하게 되면 두 배의 즐거움을 만끽할 수 있겠다. 강릉커피축제는 지난 2007년 11월 9일자 중앙일보 김한별기자가 주말 위클리판으로 특별르포기사화한 「커피가 강릉으로 간 까닭은」이라는 기사를 보고 브레인스토밍(brain storming)한 결과물이다. 2009년 10월. 「10월의 마지막 밤을 강릉커피축제와 함께」라는 슬로건으로 그해 가을 커피축제는 강릉에서 성공적으로 안착하게 된다. 사실 커피축제는 지역에서 그동안의 축제와는 좀 성격을 달리한다. 일단 커피를 숙주로 하여 축제를 연다는 것이 아이러니라는 반응들이 많다. 특정한 장소도 없으며, 커피를 주산지로 하는 나라도 아닌 강릉에서 커피축제를 한다는 것에 신기해한다. 원래 축제는 그처럼 특별한 무언가가 필요한 것이다.";
            this.info_program_pic = "@drawable/fev2_05";
            this.info_program_text = "프로그램 텍스트";
            this.info_location_pic = "@drawable/fev2_06";
            this.info_location_text = "강원도 강릉시 난설헌로 131 강릉녹색도시체험센터";
            this.info_contact_pic = "@drawable/fev2_07";
            this.info_contact_text = "전화 033-647-6802\n" +
                    "팩스 033-647-6801";

            Notice_VO n1 = new Notice_VO();
            Notice_VO n2 = new Notice_VO();
            Notice_VO n3 = new Notice_VO();
            Notice_VO n4 = new Notice_VO();
            Notice_VO n5 = new Notice_VO();

            n1.setTitle("강릉 커피 문화 중국 대륙 공략");
            n1.setContent("커피축제까지 개최하고 있는 강릉 커피문화가 중국 대륙 공략에 나섰습니다. 강릉에 커피박물관을 비롯해, 커피농장과 커피숍 등을 운영하고 있는 커피커퍼가 최근, 중국 윈난성 망시에서 최명희 강릉시장 등이 참석한 가운데, 커피박물관 개관식을 가졌습니다. 2천 600여㎡ 부지에 조성된 커피박물관에는 커피 교육관과 함께, 강원도 특산품과 우리나라 공예품과 음식을 판매하는 한국관도 설치돼 있습니다. 윈난성 망시는 지난 2012년, 강릉시와 자매결연을 맺은 도시로, 중국 전통차인 보이차 생산지로도 유명합니다.");
            n1.setCreatedBy("커피축제위원회");
            n1.setDate("2016. 06. 01 09:24");

            n2.setTitle("[한국일보] 강릉 로컬 푸드 커피, 세계시장으로");
            n2.setContent("[한국일보] 강릉 로컬 푸드 커피, 세계시장으로 의 내용이 나옵니다");
            n2.setCreatedBy("커피축제위원회");
            n2.setDate("2016. 06. 01 09:24");

            n3.setTitle("2015 강릉 핸드드립 커피 어워 출전 선수 순서 공지");
            n3.setContent("2015 강릉 핸드드립 커피 어워 출전 선수 순서 공지 의 내용이 나옵니다");
            n3.setCreatedBy("커피축제위원회");
            n3.setDate("2016. 06. 01 09:24");

            n4.setTitle("호시탐탐 커피탐탐 사연 당첨자 안내");
            n4.setContent("호시탐탐 커피탐탐 사연 당첨자 안내 의 내용이 나옵니다");
            n4.setCreatedBy("커피축제위원회");
            n4.setDate("2016. 06. 01 09:24");

            n5.setTitle("강릉 바리스타 어워드 서울예선 결과");
            n5.setContent("Grace, EunJu, Kay");
            n5.setCreatedBy("커피축제위원회");
            n5.setDate("2016. 06. 01 09:24");

            this.noticeList.add(n1);
            this.noticeList.add(n2);
            this.noticeList.add(n3);
            this.noticeList.add(n4);
            this.noticeList.add(n5);

            this.questions.add(0, "가장 좋아하는 커피 원산지는 어디?");
            this.questions.add(1, "커피가 강릉으로 간 까닭은?");
            this.questions.add(2, "커피 축제의 묘미는?");
            this.questions.add(3, "커피 축제를 누구와 즐기고 있나요?");
            this.questions.add(4, "커피 마시러 어디 자주 가나요?");
            this.questions.add(5, "커피 축제 한줄평");
            this.questions.add(6, "강릉 커피축제에서 가장 기억에 남는 명장면을 올려주세요.");

            this.q1_option.add(0, "과테말라 ");
            this.q1_option.add(1, "탄자니아");
            this.q1_option.add(2, "리우 데 자네이로");
            this.q1_option.add(3, "잘 모르겠어요");

            this.q2_option.add(0, "강릉커피의 특별한 맛");
            this.q2_option.add(1, "강릉의 풍경도 맛 ");
            this.q2_option.add(2, "커피 명인들의 집합소 ");
            this.q2_option.add(3, "유명한 커피 거리");

            this.q3_option.add(0, "강릉 전역의 유명 커피숍 찾아다니기");
            this.q3_option.add(1, "나만의 향을 가진 커피를 만들 수 있는 그라인딩 체험 부스 ");
            this.q3_option.add(2, "커피와 잘 어울리는 재즈 콘서트 ");
            this.q3_option.add(3, "세계적인 바리스타들의 커피 대전");

            this.q4_option.add(0, "친구");
            this.q4_option.add(1, "연인");
            this.q4_option.add(2, "가족");
            this.q4_option.add(3, "나는야 솔로부대");

            this.q5_option.add(0, "별다방을 비롯한 유명 커피 프랜차이즈");
            this.q5_option.add(1, "싼 맛에 먹는 커피가 최고인 1500원 이하 카페");
            this.q5_option.add(2, "독특한 맛과 인테리어가 있는 개인 운영 커피숍 ");
            this.q5_option.add(3, "가까운 곳");

            this.q1_img = "@drawable/fev1_q1";
            this.q2_img = "@drawable/fev1_q2";
            this.q3_img = "@drawable/fev1_q3";
            this.q4_img = "@drawable/fev1_q4";
            this.q5_img = "@drawable/fev1_q5";
            this.q6_img = "@drawable/fev1_q6";
            this.q7_img = "@drawable/fev1_q7";
            this.q_coupon_img = "@drawable/fev1_coupon";


        }else if(para.equals("tanger")){
            this.title = "삼척 맹방 유채꽃 축제";
            this.logo = "@drawable/fev3_logo";
            this.main_image = "@drawable/fev3_01";
            this.event_date = "2016.04.08 ~ 2016.04.17";
            this.event_long_description = "유채꽃은 제주도에만 있는게 아니라우";
            this.event_short_description = "유채꽃 축제";
            this.info_info_pic = "@drawable/fev3_03";
            this.info_info_text = "겨우내 움츠렸던 마음에 유채꽃과 벚꽃, 동해안의 쪽빛 바다가 어우러진 축제이다. 7.2ha의 유채꽃 축제장에서 봄내음과 사랑을 느껴볼 수 있으며, 노란 유채꽃과 하얀 벚꽃의 꽃망울이 사람들의 가슴에 화사함과 추억과 낭만을 안겨줄 것이다. 근덕면 상맹방리(구 7번국도)에서 매년 4월에 열리며, 자라나는 어린이들에게 예쁜 꽃밭에서 추억을 심어주고, 연인·가족과 함께 다양한 이벤트에도 참가해 볼 수 있다.";
            this.info_hist_pic = "@drawable/fev3_04";
            this.info_hist_text = "역사를 앞으로 만들어 나가겠습니다.";
            this.info_program_pic = "@drawable/fev3_05";
            this.info_program_text = "프로그램 텍스트";
            this.info_location_pic = "@drawable/fev3_06";
            this.info_location_text = "강원도 삼척시 근덕면 삼척로 3992-8";
            this.info_contact_pic = "@drawable/fev3_07";
            this.info_contact_text = "전화 033-570-3372";

            Notice_VO n1 = new Notice_VO();
            Notice_VO n2 = new Notice_VO();
            Notice_VO n3 = new Notice_VO();
            Notice_VO n4 = new Notice_VO();
            Notice_VO n5 = new Notice_VO();

            n1.setTitle("유채꽃 포토 콘테스트가 열립니다.");
            n1.setContent("2016 삼척 맹방 유채꽃 포토 콘테스트에 참가할 참가자를 모집하오니 많은 참여 바랍니다.  \n" +
                    "* 모집기간: 2016.04.08~17");
            n1.setCreatedBy("커피축제위원회");
            n1.setDate("2016. 06. 01 09:24");

            n2.setTitle("축제 기간 교통 혼잡이 예상되오니 걸어오시기 바랍니다.");
            n2.setContent("2016 삼척 맹방 유채꽃 포토 콘테스트에 참가할 참가자를 모집하오니 많은 참여 바랍니다.  \n" +
                    "* 모집기간: 2016.04.08~17");
            n2.setCreatedBy("커피축제위원회");
            n2.setDate("2016. 06. 01 09:24");

            n3.setTitle("아이와 함께 하는 유채꽃 염색 체험 참가자를 모집합니다.");
            n3.setContent("2016 삼척 맹방 유채꽃 포토 콘테스트에 참가할 참가자를 모집하오니 많은 참여 바랍니다.  \n" +
                    "* 모집기간: 2016.04.08~17");
            n3.setCreatedBy("커피축제위원회");
            n3.setDate("2016. 06. 01 09:24");

            n4.setTitle("2016 삼척 맹방 유채꽃 축제 홍보 팜플렛 입니다.");
            n4.setContent("2016 삼척 맹방 유채꽃 포토 콘테스트에 참가할 참가자를 모집하오니 많은 참여 바랍니다.  \n" +
                    "* 모집기간: 2016.04.08~17");
            n4.setCreatedBy("커피축제위원회");
            n4.setDate("2016. 06. 01 09:24");

            n5.setTitle("2016 삼척 맹방 유채꽃 축제가 개최됩니다.");
            n5.setContent("2016 삼척 맹방 유채꽃 포토 콘테스트에 참가할 참가자를 모집하오니 많은 참여 바랍니다.  \n" +
                    "* 모집기간: 2016.04.08~17");
            n5.setCreatedBy("커피축제위원회");
            n5.setDate("2016. 06. 01 09:24");

            this.noticeList.add(n1);
            this.noticeList.add(n2);
            this.noticeList.add(n3);
            this.noticeList.add(n4);
            this.noticeList.add(n5);

            this.questions.add(0, "유채꽃의 꽃말은?");
            this.questions.add(1, "맹방유채꽃이 가장 아름답게 피는 시기는?");
            this.questions.add(2, "유채꽃과 함께 즐긴 음식 중 가장 맛있었던 것은?");
            this.questions.add(3, "맹방유채꽃축제를 누구와 즐기고 있나요?");
            this.questions.add(4, "맹방유채꽃 축제를 꼭 와야하는 이유는?");
            this.questions.add(5, "유채꽃을 한단어로 표현한다면?");
            this.questions.add(6, "맹방유채꽃축제에서 가장 즐거웠던 순간을 올려주세요.");

            this.q1_option.add(0, "희망찬 올해");
            this.q1_option.add(1, "쾌활한 당신");
            this.q1_option.add(2, "행복하지 말아요");
            this.q1_option.add(3, "언젠가는 우리 다시 만나리");

            this.q2_option.add(0, "3월 중순");
            this.q2_option.add(1, "4월 중순");
            this.q2_option.add(2, "5월 중순");
            this.q2_option.add(3, "6월 중순");

            this.q3_option.add(0, "유채나물정식");
            this.q3_option.add(1, "유채꽃떡");
            this.q3_option.add(2, "유채꽃잎차");
            this.q3_option.add(3, "유채꽃아이스크림");

            this.q4_option.add(0, "친구");
            this.q4_option.add(1, "연인");
            this.q4_option.add(2, "가족");
            this.q4_option.add(3, "나는야 솔로부대");

            this.q5_option.add(0, "바다도 보고, 유채꽃도 보려고");
            this.q5_option.add(1, "사진발을 잘받는 배경이라");
            this.q5_option.add(2, "제주도는 너무 머니까");
            this.q5_option.add(3, "먹방을 찍으려고");


            this.q_coupon_img = "@drawable/fev1_coupon";

        }else if(para.equals("squid")){
            this.title = "오징어축제";
            this.logo = "@drawable/fev3_logo";
            this.main_image = "@drawable/fev3_02";
            this.event_date = "2016.06.05 ~ 2016.06.12";
            this.event_long_description = "주문진의 특산물인 오징어를 주제로 하여 독창적인 향토문화 축제로 계승 발전하고자 오징어 축제를 개최하게되었습니다.";
            this.event_short_description = "싱싱한 오징어의 고장 주문진";
            this.info_info_pic = "@drawable/fev3_03";
            this.info_info_text = "싱싱한 오징어의 고장 주문진";
            this.info_hist_pic = "@drawable/fev3_04";
            this.info_hist_text = "역사를 앞으로 만들어 나가겠습니다.";
            this.info_program_pic = "@drawable/fev3_05";
            this.info_program_text = "프로그램 텍스트";
            this.info_location_pic = "@drawable/fev3_06";
            this.info_location_text = "강릉시 주문진교항리 386-4번지 주문진청년회의소 ";
            this.info_contact_pic = "@drawable/fev3_07";
            this.info_contact_text = "전화 033-662-4532\n" +
                    "팩스 033-661-4532";


            Notice_VO n1 = new Notice_VO();
            Notice_VO n2 = new Notice_VO();

            n1.setTitle("오징어 요리대회에 참가할 참가자를 모집합니다.");
            n1.setContent("2016 주문진 오징어 요리대회에 참가할 참가자를 모집하오니 많은 신청 바랍니다. \n" +
                    "* 모집인원: 10명 \n" +
                    "* 모집기간: 2016.10.7(월)~14(월)");
            n1.setCreatedBy("오징어축제위원회");
            n1.setDate("2016. 06. 24 09:24");

            n2.setTitle("2016 주문진 오징어 축제 초대가수");
            n2.setContent("David 벗꽃");
            n2.setCreatedBy("오징어축제위원회");
            n2.setDate("2016. 06. 21 09:07");


            this.noticeList.add(n1);
            this.noticeList.add(n2);

            this.questions.add(0, "오징어하면 생각나는 것은?");
            this.questions.add(1, "주문진 오징어 축제에서 맛 본 오징어 요리 중 가장 맛있었던 것은?");
            this.questions.add(2, "주문진 오징어 축제에서 맨손으로 몇마리의 오징어를 낚았나요?");
            this.questions.add(3, "주문진 오징어 축제를를 누구와 즐기고 있나요?");
            this.questions.add(4, "주문진 오징어 축제에 오는데 소요된 시간은?");
            this.questions.add(5, "오징어에게 한마디 한다면?");
            this.questions.add(6, "오징어 축제와 가장 어울리는 사진을 올려주세요.");

            this.q1_option.add(0, "두족류 십완목에 속하는 연체동물");
            this.q1_option.add(1, "맥주 안주");
            this.q1_option.add(2, "거울에 비친 내 모습");
            this.q1_option.add(3, "다리가 8개인가 10개인가");

            this.q2_option.add(0, "매콤한 오징어 덮밥");
            this.q2_option.add(1, "촙초롬한 오징어 회");
            this.q2_option.add(2, "고소한 오징어순대 ");
            this.q2_option.add(3, "노릇노릇 구워진 반건조 오징어");

            this.q3_option.add(0, "10마리 이상");
            this.q3_option.add(1, "5마리 이상");
            this.q3_option.add(2, "1마리 이상");
            this.q3_option.add(3, "빈손으로 돌아갑니다.");

            this.q4_option.add(0, "친구");
            this.q4_option.add(1, "연인");
            this.q4_option.add(2, "가족");
            this.q4_option.add(3, "나는야 솔로부대");

            this.q5_option.add(0, "내가 제일 멀 듯..하루 이상");
            this.q5_option.add(1, "3시간 정도?");
            this.q5_option.add(2, "30분 정도?");
            this.q5_option.add(3, "집 앞");

            this.q_coupon_img = "@drawable/fev1_coupon";


        }

    }
    private String title;
    private String logo;
    private String main_image;
    private String event_date;
    private String event_long_description;
    private String event_short_description;

    private String info_info_pic;
    private String info_info_text;
    private String info_hist_pic;
    private String info_hist_text;
    private String info_program_pic;
    private String info_program_text;
    private String info_location_pic;
    private String info_location_text;
    private String info_contact_pic;
    private String info_contact_text;

    private List<Notice_VO> noticeList = new ArrayList<>();


    private List<String> q1_option = new ArrayList<>();;
    private List<String> q2_option = new ArrayList<>();;
    private List<String> q3_option = new ArrayList<>();;
    private List<String> q4_option = new ArrayList<>();;
    private List<String> q5_option = new ArrayList<>();;

    private List<String> questions  = new ArrayList<>();

    private String q1_img;
    private String q2_img;
    private String q3_img;
    private String q4_img;
    private String q5_img;
    private String q6_img;
    private String q7_img;
    private String q_coupon_img;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getMain_image() {
        return main_image;
    }

    public void setMain_image(String main_image) {
        this.main_image = main_image;
    }

    public String getEvent_date() {
        return event_date;
    }

    public void setEvent_date(String event_date) {
        this.event_date = event_date;
    }

    public String getEvent_long_description() {
        return event_long_description;
    }

    public void setEvent_long_description(String event_long_description) {
        this.event_long_description = event_long_description;
    }

    public String getEvent_short_description() {
        return event_short_description;
    }

    public void setEvent_short_description(String event_short_description) {
        this.event_short_description = event_short_description;
    }


    public String getInfo_info_pic() {
        return info_info_pic;
    }

    public void setInfo_info_pic(String info_info_pic) {
        this.info_info_pic = info_info_pic;
    }

    public String getInfo_info_text() {
        return info_info_text;
    }

    public void setInfo_info_text(String info_info_text) {
        this.info_info_text = info_info_text;
    }

    public String getInfo_hist_pic() {
        return info_hist_pic;
    }

    public void setInfo_hist_pic(String info_hist_pic) {
        this.info_hist_pic = info_hist_pic;
    }

    public String getInfo_hist_text() {
        return info_hist_text;
    }

    public void setInfo_hist_text(String info_hist_text) {
        this.info_hist_text = info_hist_text;
    }

    public String getInfo_program_pic() {
        return info_program_pic;
    }

    public void setInfo_program_pic(String info_program_pic) {
        this.info_program_pic = info_program_pic;
    }

    public String getInfo_program_text() {
        return info_program_text;
    }

    public void setInfo_program_text(String info_program_text) {
        this.info_program_text = info_program_text;
    }

    public String getInfo_location_pic() {
        return info_location_pic;
    }

    public void setInfo_location_pic(String info_location_pic) {
        this.info_location_pic = info_location_pic;
    }

    public String getInfo_location_text() {
        return info_location_text;
    }

    public void setInfo_location_text(String info_location_text) {
        this.info_location_text = info_location_text;
    }

    public String getInfo_contact_pic() {
        return info_contact_pic;
    }

    public void setInfo_contact_pic(String info_contact_pic) {
        this.info_contact_pic = info_contact_pic;
    }

    public String getInfo_contact_text() {
        return info_contact_text;
    }

    public void setInfo_contact_text(String info_contact_text) {
        this.info_contact_text = info_contact_text;
    }

    public List<Notice_VO> getNoticeList() {
        return noticeList;
    }

    public void setNoticeList(List<Notice_VO> noticeList) {
        this.noticeList = noticeList;
    }


    public List<String> getQ1_option() {
        return q1_option;
    }

    public void setQ1_option(List<String> q1_option) {
        this.q1_option = q1_option;
    }

    public List<String> getQ2_option() {
        return q2_option;
    }

    public void setQ2_option(List<String> q2_option) {
        this.q2_option = q2_option;
    }

    public List<String> getQ3_option() {
        return q3_option;
    }

    public void setQ3_option(List<String> q3_option) {
        this.q3_option = q3_option;
    }

    public List<String> getQ4_option() {
        return q4_option;
    }

    public void setQ4_option(List<String> q4_option) {
        this.q4_option = q4_option;
    }

    public List<String> getQ5_option() {
        return q5_option;
    }

    public void setQ5_option(List<String> q5_option) {
        this.q5_option = q5_option;
    }

    public List<String> getQuestions() {
        return questions;
    }

    public void setQuestions(List<String> questions) {
        this.questions = questions;
    }


    public String getQ1_img() {
        return q1_img;
    }

    public void setQ1_img(String q1_img) {
        this.q1_img = q1_img;
    }

    public String getQ2_img() {
        return q2_img;
    }

    public void setQ2_img(String q2_img) {
        this.q2_img = q2_img;
    }

    public String getQ3_img() {
        return q3_img;
    }

    public void setQ3_img(String q3_img) {
        this.q3_img = q3_img;
    }

    public String getQ4_img() {
        return q4_img;
    }

    public void setQ4_img(String q4_img) {
        this.q4_img = q4_img;
    }

    public String getQ5_img() {
        return q5_img;
    }

    public void setQ5_img(String q5_img) {
        this.q5_img = q5_img;
    }

    public String getQ6_img() {
        return q6_img;
    }

    public void setQ6_img(String q6_img) {
        this.q6_img = q6_img;
    }

    public String getQ7_img() {
        return q7_img;
    }

    public void setQ7_img(String q7_img) {
        this.q7_img = q7_img;
    }

    public String getQ_coupon_img() {
        return q_coupon_img;
    }

    public void setQ_coupon_img(String q_coupon_img) {
        this.q_coupon_img = q_coupon_img;
    }
}
