<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Ajax登陆</title>
</head>
<body>

<script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>



<div id="form-div">
    <form id="form1" onsubmit="return false" action="##" method="post">
        <p>用户名：<input name="userName" type="text" id="txtUserName" tabindex="1" size="15" value=""/></p>
        <p>密　码：<input name="password" type="password" id="TextBox2" tabindex="2" size="16" value=""/></p>
        
        
        
        <p>图片: <input name="image" type="file" id="image" /></p>
        
        

 


        <p><input type="button" value="登录" onclick="login()">&nbsp;<input type="reset" value="重置"></p>
    </form>
</div>





<script type="text/javascript">







/***

//闭包函数
var fun1 = function a(str){
	alert(str);
	//这里是 回调成功的逻辑
}


function b(f){   //接收闭包函数变量
	var s = "hello world!";  //假设s就是服务端返回的数据
	f(s);   //引用f这个闭包变量，回调闭包函数
}

b(fun1);
***/

//application/x-www-form-urlencoded, multipart/form-data, or text/plain application/json;charset=UTF-8
//封装
function ajax(url,type,cType,json,reqType,fData,successBackFun,$formDom){
	if(reqType == "obj"){                     //不支持图片上传,非formData
	    $.ajax({
            //请求方式
            type : type,
            //请求的媒体类型
            contentType: cType,
            //请求地址
            url : url,
            dataType: "json",
            //数据，json字符串
            data : json,
            //请求成功
            success : function(result) {
                console.log(result);
                successBackFun(result);
                
            },
            //请求失败，包含具体的错误信息
            error : function(e){
                console.log(e.status);
                console.log(e.responseText);
            }
         });		
	}else if(reqType == "formdata"){         //图片上传,formData
		$.ajax({
            //请求方式
            type : type,
            //请求地址
            url : url,
            dataType: "json",
            contentType:cType,
            processData:false,
            //数据，json字符串
            data : fData,
            //请求成功
            success : function(result) {
                console.log(result);
                successBackFun(result);
                
            },
            //请求失败，包含具体的错误信息
            error : function(e){
                console.log(e.status);
                console.log(e.responseText);
            }
         });	
	}else if(reqType == "dom"){

		 $.ajax({
                 //几个参数需要注意一下
                type: type,//方法类型
                dataType: "json",//预期服务器返回的数据类型
                url: url,//url
                data: $formDom.serialize(),
                success: function (result) {
                    console.log(result);//打印服务端返回的数据(调试用)
                    successBackFun(result)
                },
                error : function() {
                    console.log(e.status);
                    console.log(e.responseText);
                }
          });

	}
	
}



/**
 * 登录方法
 */
function login(){
	var txtUserName = $("#txtUserName").val();     //用户名
	var password = $("#TextBox2").val();           //密码
	var image = $("#image");

	//登录成功后的回调闭包函数
	var loginReturn = function(data){  //匿名函数
		console.log(data);
		if(data.status == 0){
			location.href = "http://www.baidu.com/"   //后台入口servlet
		}else{
           alert(data.msg)
		}
	}


	//json对象
	var data = {"username":txtUserName,"password":password};  

	//构建FormData对象
	//var fd = new FormData($("#form1")[0])  //FormData对象  
	//fd.append("username",txtUserName);
	//fd.append("password",password);
	//ajax调用
	//ajax("/login3/UserServlet","POST",false,null,"formdata",fd,loginReturn,null);



	ajax("/login3/UserServlet","POST","application/x-www-form-urlencoded",data,"obj",null,loginReturn,null);

	
	
	
}



</script>



</body>
</html>