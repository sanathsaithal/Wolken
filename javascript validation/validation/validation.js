var numbers = /^[0-9]+$/;
var emailVal = /^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+.[a-zA-Z0-9-.]+$/;
var letters = /^[a-z]+$/;
var upperCaseLetters = new RegExp('[A-Z]');
var lowerCaseLetters = new RegExp('[a-z]');
var name=$("#name").val();
var email=$("#email").val();
var contact=$("#contact").val();
var date=$('#dob').val();
var gender=$("input[name='gender']:checked").val();
var relationshipStatus=$('input[type=checkbox]:checked');
var city=$("#city").val();
var nationality=$("#nationality").val();
var password=$("#password").val();
var conPassword=$("#conPassword").val();

function validateName()
{
    var name=$("#name").val();
    if(name.length>3 && name.length<15 && name.length !="" && name.match(letters)) {
        $("#errName").html('');
    }
    else {
        $("#errName").html('Name must contain only lowecase letters with more than 3 charecters');
    }
}

function validateEmail()
{
    var email=$("#email").val();
    if(email.length>=6 && email.length<18 && email.length != "" && email.match(emailVal)) {
        $("#errEmail").html('');
    }
    else{
        $("#errEmail").html('Please enter valid email id with @ and .'); 
    }
}

function validateContact()
{
    var contact=$("#contact").val();
    var number =new RegExp('[0-9]');
    if(contact.length==10 && contact!="" && contact.match(number)) {
        $("#errContact").html('');
    }
    else {
        $("#errContact").html('Contact no should have only 10 digit numbers');
    }
}

function validateCity()
{
    var city=$("#city").val();
    if(city!="" && city.match(letters)) {
        $("#errCity").html('');
    }
    else{
        $("#errCity").html('City must contain only lowercase letters');
    }
}

function validatePassword()
{
    var password=$("#password").val();
    var lowerCaseLetters = new RegExp('[A-Z]');
    var upperCaseLetters = new RegExp('[a-z]');
    var number =new RegExp('[0-9]');
    if(password.length>8 && password.length<16 && password.length !="" && password.match(lowerCaseLetters) && password.match(upperCaseLetters) && password.match(number)) {
        $("#errPassword").html('');
    }
    else{
        $("#errPassword").html('Password must have uppercase, lowercase letters and numbers');
    }
}

function validateConPassword()
{
    var password=$("#password").val();
    var conPassword=$("#conPassword").val();
    if(password==conPassword) {
        $("#errConPassword").html('');
    }
    else {
        $("#errConPassword").html('Please provide password same as previous one');
    }
}

function validation()
{
    var date=$('#dob').val();
    var gender=$("input[name='gender']:checked").val();
    var relationshipStatus=$('input[type=checkbox]:checked');
    var nationality=$("#nationality").val();
    if(date!="") {
        $("#errDate").html('');
        if(gender) {
            $("#errGender").html('');
            if(relationshipStatus.length>0) {
                $("#errRelationshipStatus").html('');
                if(nationality!="") {
                    $("#errNationality").html('');
                }else {
                    $("#errNationality").html('Please select one');
                }
            } else {
                $("#errRelationshipStatus").html('Please select relationship status');
            } 
        }else {
            $("#errGender").html('Please select gender');
        }
    }else {
        $('#errDate').html('please enter date');
    }
}
