function validateToSave()
{
    var numbers = /^[0-9]+$/;
    var emailVal = /^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+.[a-zA-Z0-9-.]+$/;
    var letters = /^[a-z]+$/;
    var lowerCaseLetters = new RegExp('[A-Z]');
    var upperCaseLetters = new RegExp('[a-z]');
    
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

    if(name.length>3 && name.length<15 && name.length !="" && name.match(letters)) {
        $("#errName").html('');
        if(email.length>=6 && email.length<18 && email.length != "" && email.match(emailVal)) {
            $("#errEmail").html('');
            if(contact.length==10 && contact!="" && contact.match(numbers)) {
                $("#errContact").html('');
                if(date!="") {
                    $("#errDate").html('');
                    if(gender) {
                        $("#errGender").html('');
                        if(relationshipStatus.length>0) {
                            $("#errRelationshipStatus").html('');
                            if(city!="" && city.match(letters)) {
                                $("#errCity").html('');
                                if(nationality!="") {
                                    $("#errNationality").html('');
                                    if(password.length>8 && password.length<16 && password.length !="" && password.match(lowerCaseLetters) && password.match(upperCaseLetters) && password.match(numbers)) {
                                        $("#errPassword").html('');
                                        if(conPassword==password) {
                                            $("#errConPassword").html('');
                                            } else {
                                                $("#errConPassword").html('password missmatch');
                                            }
                                        } else {
                                            $("#errPassword").html('password must be have all types of charecters');
                                        }
                                    } else {
                                        $("#errNationality").html('Please select one');
                                    }
                                } else {
                                    $("#errCity").html('City should not be null, and it must have only lowerecase letters');
                                } 
                            }else {
                                $("#errRelationshipStatus").html('Please select relationship status');
                            }
                        } else {
                            $("#errGender").html('Please select gender');
                        }
                    } else {
                        $('#errDate').html('please enter date');
                    }
                } else {
                    $("#errContact").html('Contact not proper, must contain only 10 digit numbers');
                }
            } else {
                $("#errEmail").html('Email not proper, must contain charecters, digits and @, .');
            }
        } else {
            $("#errName").html('Please input alphabet characters only in lowercase');
    }
} 
        
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
