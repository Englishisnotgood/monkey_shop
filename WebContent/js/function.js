function change(img) {
	img.src="getcode?" + new Date().getTime();
}

function FocusItem(obj){
	if($(obj).attr('name') == 'veryCode'){
		$(obj).next().next().html('').removeClass('error');
	}else{
		$(obj).next('span').html('').removeClass('error');
	}
}

function CheckItem(obj){
	var msgBox = $(obj).next('span');
	
	switch($(obj).attr('name')){
	case "userName":
		if(obj.value == ""){
			msgBox.html('用户名不能为空');
			msgBox.addClass('error');
		}else{
			var url = "usernamecheck?name="+encodeURI($(obj).val())+"&"+new Date().getTime();
			$.get(url, function(data){
				if(data == "false"){
					msgBox.html('用户名不能使用');
					msgBox.addClass('error');
				}else{
					msgBox.html().removeClass('error');
				}
			});
		}
		break;
	case "password":
		if(obj.value == ""){
			msgBox.html('密码不能为空');
			msgBox.addClass('error');
		}
		break;
	case "rePassword":
		if(obj.value == ""){
			msgBox.html('重复密码不能为空');
			msgBox.addClass('error');
		}else if($(obj).val() != $('input[name="password"]').val()){
			msgBox.html('两次输入不一致');
			msgBox.addClass('error');
		}
		break;
	case "veryCode":
		var numshow = $(obj).next().next();
		if(obj.value == ""){
			numshow.html('验证码不能为空');
			numshow.addClass('error');
		}else{
			var url = "checkusernum?num="+encodeURI($(obj).val())+"&"+new Date().getTime();
			$.get(url, function(numdata){
				if(numdata == 'false'){
					numshow.html("验证码错误");
					numshow.addClass('error');
				}else{
					numshow.html().removeClass('error');
				}
			});
		}
		break;
	}
}
