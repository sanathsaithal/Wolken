function validateToLogin()
{
    var letterNum = /^[a-zA-Z0-9]+$/;
    var emailVal = /^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+.[a-zA-Z0-9-.]+$/;
    var letters = /^[a-z]+$/;
    var email=$("#email").val();
    var password=$("#password").val();

    if(email.length>=6 && email.length<18 && email.length != "" && email.match(emailVal)) {
        $("#errEmail").html('');
        if(password.length>8 && password.length<16 && password.length !="" && password.match(letterNum)) {
            $("#errPassword").html('');
        } else {
            $("#errPassword").html('password must be have all types of charecters');
        }
    } else {
        $("#errEmail").html('email not proper');
    }
}
