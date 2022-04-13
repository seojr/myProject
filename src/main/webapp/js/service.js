function submit(jqform, url, tar, mtd) {
	var f = jqform[0];
	console.log(f);
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