function validateToLogin()
{
    var numbers = /^[0-9]+$/;
    var emailVal = /^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+.[a-zA-Z0-9-.]+$/;
    var letters = /^[a-z]+$/;
    var lowerCaseLetters = new RegExp('[A-Z]');
    var upperCaseLetters = new RegExp('[a-z]');

    if(email.length>=6 && email.length<18 && email.length != "" && email.match(emailVal)) {
        $("#errEmail").html('');
        if(password.length>8 && password.length<16 && password.length !="" && password.match(lowerCaseLetters) && password.match(upperCaseLetters) && password.match(numbers)) {
            $("#errPassword").html('');
        } else {
            $("#errPassword").html('password must be have all types of charecters');
        }
    } else {
        $("#errEmail").html('Email not proper, must contain charecters, digits and @, .');
    }
}
