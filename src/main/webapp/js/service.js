/**-----------------------------------------------------------------------------
 * Service 관련 처리- ajax, submit
 * 함수는 svcf_ 접두사로 한다.
 * 변수는 svcv_ 접두사로 한다.
 *----------------------------------------------------------------------------*/


function submit(jqform, url, tar, mtd) {
	var f = jqform[0];
	if (f.encoding.indexOf("multipart") > -1) {
		f.encoding = "application/x-www-form-urlencoded";
	}
	f.action = contextPath + url;
	if (mtd == null) {
		f.method = "post";
	}else {
		f.method = mtd;
	}
	if (tar == null) {
		f.target = "_self";
	}else {
		f.target = tar;
	}
	f.submit();
}