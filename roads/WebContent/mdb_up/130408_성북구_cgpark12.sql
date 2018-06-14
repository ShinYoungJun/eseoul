-- 20130408 성북구  문제 --
select * from gapan_taxation_info where gapan_no = '290138_4_0004' and year = 2013;

/* 세올까지 가지 않은  부과 정보 */
/*
update gapan_taxation_info 
set dept_cd = 3070212 
where year = 2013 
  and dept_cd = 3070152
  and tax_yn is null;
*/
select * from ref_deptcode where gu_nm = '성북구'

select * from user_code where org_cd = 3070000;

update user_code 
set dept_cd = 3070212
where dept_cd = 3070152

SELECT A.*, cryptit.decrypt(A.PW,A.USER_ID) PASS_WORD, B.GU_NM, B.DEPT_NM , B.SIGU_CD
  FROM USER_CODE A, 
   	   (SELECT ORG_CD, GU_NM, DEPT_CD, DEPT_NM, SUBSTR(SIGU_CD,3,3) SIGU_CD 
          FROM REF_DEPTCODE  
          GROUP BY ORG_CD, GU_NM, DEPT_CD, DEPT_NM, SIGU_CD) B 
 		WHERE A.USER_ID = 'mellowman'
		  AND A.ORG_CD = B.ORG_CD 
		  AND A.DEPT_CD = B.DEPT_CD;

--20130408 강서구 삭제 문제 --
select * from gapan_cal_sum_info;
