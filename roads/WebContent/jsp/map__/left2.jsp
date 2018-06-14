<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>:::::  :::::</title>
<link href="/css/Mroads.css" rel="stylesheet" type="text/css">
<style type="text/css">
<!--
body {
	margin: 0px;
	background-image: url(/img/mapImg/left_background.gif);
}
-->
</style>
</head>
<body>
<table width="260" height="100%" border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td width="10"></td>
    <td valign="top"><table width="240" height="100%" border="0" cellpadding="0" cellspacing="0">
      <tr>
        <td height="37" valign="top"><table border="0" cellspacing="0" cellpadding="0">
            <tr>
              <td><a href="/jsp/map/left.html"><img src="/img/mapImg/tab1_off.gif" alt="도로점용" width="120" height="37" border="0"></a></td>
              <td><a href="/jsp/map/left2.html"><img src="/img/mapImg/tab2_on.gif" alt="노정관리" width="120" height="37" border="0"></a></td>
            </tr>
        </table></td>
      </tr>
      <tr>
        <td height="50" align="center" valign="top" bgcolor="f9f9f9" class="M_leftborder"><table width="220" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td valign="top"><table width="220" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td height="33"><img src="/img/mapImg/left_title1.gif" alt="점용지 검색" width="220" height="33"></td>
              </tr>
              <tr>
                <td align="center" valign="top" class="M_leftborder2"><table width="198" border="0" cellpadding="0" cellspacing="0" class="Map_stan">
                    <tr>
                      <td width="59" height="22" class="Map_stan_b">점용구분</td>
                      <td><select name="select3" class="input_form1" style="width:139px; background:e0eaf7">
                          <option>도로</option>
                          <option>하천</option>
                      </select></td>
                    </tr>
                    <tr>
                      <td height="22">시/군/구</td>
                      <td><select name="select" class="input_form1" style="width:139px">
                          <option>종로구</option>
                        </select>                      </td>
                    </tr>
                    <tr>
                      <td height="22">읍/면/동</td>
                      <td><select name="select2" class="input_form1" style="width:139px">
                          <option>전체</option>
                      </select></td>
                    </tr>
                    <tr>
                      <td height="22">산/번지</td>
                      <td><input name="checkbox4" type="checkbox" value="checkbox" checked>
                          <input name="textfield2224" type="text" class="input_form1" style="width:48px">
                        -
                        <input name="textfield22242" type="text" class="input_form1" style="width:48px">                      </td>
                    </tr>
                </table></td>
              </tr>
              <tr>
                <td height="9" background="/img/mapImg/left_bott_line.gif"></td>
              </tr>
            </table></td>
          </tr>
          <tr>
            <td valign="top"><table width="220" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td height="32"><img src="/img/mapImg/left_title2.gif" alt="점용지 검색" width="220" height="32"></td>
              </tr>
              <tr>
                <td align="center" valign="top" class="M_leftborder2"><table width="198" border="0" cellpadding="0" cellspacing="0" class="Map_stan">
                    <tr>
                      <td width="59" height="22">점용인</td>
                      <td><input name="textfield2224422" type="text" class="input_form1" style="width:139px"></td>
                    </tr>
                    <tr>
                      <td height="22">주민번호</td>
                      <td><input name="textfield2224322" type="text" class="input_form1" style="width:60px">
                        -
                        <input name="textfield22242222" type="text" class="input_form1" style="width:60px">
                      </td>
                    </tr>
                </table></td>
              </tr>
              <tr>
                <td height="9" background="/img/mapImg/left_bott_line.gif"></td>
              </tr>
            </table></td>
          </tr>
          <tr>
            <td height="40" align="center"><a href="#"><img src="/img/mapImg/search_icon.gif" alt="검색" width="220" height="20" border="0"></a></td>
          </tr>
        </table></td>
      </tr>
      <tr>
        <td height="7"></td>
      </tr>
      <tr>
        <td height="31"><img src="/img/mapImg/result_title.gif" width="240" height="31"></td>
      </tr>
      <tr>
        <td align="center" valign="top" bgcolor="f9f9f9" class="M_leftborder"><table width="216" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td height="10"></td>
          </tr>
          <tr>
            <td><table width="216" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td height="25" align="right" class="Map_stan">검색결과 (총 <span class="sub_stan_blue">4</span>건) </td>
              </tr>
              <tr>
                <td><table width="216" border="0" cellpadding="0" cellspacing="0" class="Map_stan">
                    <tr>
                      <td height="1" colspan="5" bgcolor="a3d1ec"></td>
                    </tr>
                    <tr>
                      <td width="51" height="28" align="center" bgcolor="deedf6" class="sub_stan_blue">점용인</td>
                      <td width="1" bgcolor="deedf6"><img src="/img/mapImg/result_blue.gif" width="1" height="20"></td>
                      <td width="118" align="center" bgcolor="deedf6" class="sub_stan_blue">동/번지</td>
                      <td width="1" bgcolor="deedf6"><img src="/img/mapImg/result_blue.gif" width="1" height="20"></td>
                      <td width="45" align="center" bgcolor="deedf6" class="sub_stan_blue">지목</td>
                    </tr>
                    <tr>
                      <td colspan="5" bgcolor="a3d1ec"></td>
                    </tr>
                    <tr>
                      <td height="23" align="center"><a href="#" class="inqu"><a href="#" class="inqu">김병모</a></td>
                      <td><img src="/img/mapImg/result_gray.gif" width="1" height="15"></td>
                      <td class="table_bl_left"><a href="#" class="inqu"><a href="#" class="inqu">우면동 142-3</a></td>
                      <td><img src="/img/mapImg/result_gray.gif" width="1" height="15"></td>
                      <td align="center"><a href="#" class="inqu"><a href="#" class="inqu">도로</a></td>
                    </tr>
                    <tr>
                      <td height="1" colspan="5" bgcolor="dbdbdb"></td>
                    </tr>
                    <tr>
                      <td height="23" align="center" bgcolor="f7f7f7"><a href="#" class="inqu">김병모</a></td>
                      <td bgcolor="f7f7f7"><img src="/img/mapImg/result_gray.gif" width="1" height="15"></td>
                      <td bgcolor="f7f7f7" class="table_bl_left"><a href="#" class="inqu">우면동 142-3</a></td>
                      <td bgcolor="f7f7f7"><img src="/img/mapImg/result_gray.gif" width="1" height="15"></td>
                      <td align="center" bgcolor="f7f7f7"><a href="#" class="inqu">하천</a></td>
                    </tr>
                    <tr>
                      <td height="1" colspan="5" bgcolor="dbdbdb"></td>
                    </tr>
                    <tr>
                      <td height="23" align="center"><a href="#" class="inqu">김병모</a></td>
                      <td><img src="/img/mapImg/result_gray.gif" width="1" height="15"></td>
                      <td class="table_bl_left"><a href="#" class="inqu">우면동 142-3</a></td>
                      <td><img src="/img/mapImg/result_gray.gif" width="1" height="15"></td>
                      <td align="center"><a href="#" class="inqu">도로</a></td>
                    </tr>
                    <tr>
                      <td height="1" colspan="5" bgcolor="dbdbdb"></td>
                    </tr>
                    <tr>
                      <td height="23" align="center" bgcolor="f7f7f7"><a href="#" class="inqu">김병모</a></td>
                      <td bgcolor="f7f7f7"><img src="/img/mapImg/result_gray.gif" width="1" height="15"></td>
                      <td bgcolor="f7f7f7" class="table_bl_left"><a href="#" class="inqu">우면동 142-3</a></td>
                      <td bgcolor="f7f7f7"><img src="/img/mapImg/result_gray.gif" width="1" height="15"></td>
                      <td align="center" bgcolor="f7f7f7"><a href="#" class="inqu">하천</a></td>
                    </tr>
                    <tr>
                      <td height="1" colspan="5" bgcolor="dbdbdb"></td>
                    </tr>
                </table></td>
              </tr>
              <tr>
                <td height="40" align="center"><table border="0" cellspacing="0" cellpadding="0">
                    <tr>
                      <td><a href="#"><img src="/img/mapImg/prev_icon.gif" width="12" height="11" border="0"></a></td>
                      <td width="15"></td>
                      <td align="center"><a href="#" class="list">1</a> <a href="#" class="list">2</a> <a href="#" class="list">3</a> <a href="#" class="list">4</a> <a href="#" class="list">5</a> <a href="#" class="list">6</a></td>
                      <td width="15">&nbsp;</td>
                      <td><a href="#"><img src="/img/mapImg/next_icon.gif" width="12" height="11" border="0"></a></td>
                    </tr>
                </table></td>
              </tr>
              <tr>
                <td>&nbsp;</td>
              </tr>
            </table></td>
          </tr>
          <tr>
            <td height="20"></td>
          </tr>
        </table></td>
      </tr>
    </table></td>
    <td width="10"></td>
  </tr>
</table>
</body>
</html>
