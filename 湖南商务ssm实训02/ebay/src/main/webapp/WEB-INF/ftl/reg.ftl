<!DOCTYPE html>
<html lang="en">
    <head>
    <meta charset="UTF-8">
    <title>用户注册</title>
    <!-- 引入 layui.css -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/layui/2.6.8/css/layui.min.css"/>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/layui/2.6.8/layui.min.js" integrity="sha512-EKrFvch3qTzLFQgjbcjpsRmF8T3UCtc9ojtMAu6dvvP+bV8qYUDOaQ84nwYCkSLT7lbqGoya/Kf+8fyCBE0vRg==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
    </head>

    <body>

    <div class="layui-row layui-col-space10">
        <div class="layui-col-md4">
        </div>
        <div class="layui-col-md4">
            <form class="layui-form" action="">
                <div class="layui-form-item">
                    <label class="layui-form-label">用户名</label>
                    <div class="layui-input-block">
                        <input type="text" name="title" required  lay-verify="required" placeholder="请输入用户名" autocomplete="off" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">密码框</label>
                    <div class="layui-input-inline">
                        <input type="password" name="password1" required lay-verify="required" placeholder="请输入密码" autocomplete="off" class="layui-input">
                    </div>
                    <div class="layui-form-mid layui-word-aux">密码不能少于6位</div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">密码框</label>
                    <div class="layui-input-inline">
                        <input type="password" name="password2" required lay-verify="required" placeholder="请输入确认密码" autocomplete="off" class="layui-input">
                    </div>
                    <div class="layui-form-mid layui-word-aux">密码不能少于6位</div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">选择部门</label>
                    <div class="layui-input-block">
                        <select name="city" lay-verify="required">
                            <option value=""></option>
                            <#list deptList as value>
                                <option value="${value.id}">${value.dname}</option>
                            </#list>
                        </select>
                    </div>
                </div>
                <div class="layui-form-item">
                    <div class="layui-input-block">
                        <button class="layui-btn" lay-submit lay-filter="formDemo">立即提交</button>
                        <button type="reset" class="layui-btn layui-btn-primary">重置</button>
                    </div>
                </div>
            </form>
        </div>
        <div class="layui-col-md4">
        </div>
    </div>



    <script>
        //Demo
        layui.use('form', function(){
            var form = layui.form;
            //监听提交
            form.on('submit(formDemo)', function(data){
                layer.msg(JSON.stringify(data.field));
                return false;
            });
        });
    </script>
    </body>
</html>