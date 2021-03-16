
//登录的方法
function login(){
    var loginName=$("#loginName").val();
    var password=$("#password").val();
    $.ajax({
        url:contextPath+"/Login",   //这个异步提交到 /Login urlPatterns = { "/Login" } 指定路径，action反射到方法
        method:"post",
        data:{loginName:loginName,password:password,action:"login"},
        success:function(jsonStr){
            var result=eval("("+jsonStr+")");
            if(result.status==1){
                window.location.href=contextPath+"/Home?action=index";
            }else{
                showMessage(result.message)
            }
        }
    })
}

