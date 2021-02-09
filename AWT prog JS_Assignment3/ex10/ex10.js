
// mouse event
jQuery(document).ready(function(jQuery){
        jQuery("#btn").click(function(){
            alert("mouse clicked");
        });
});

jQuery(document).ready(function(jQuery){
        jQuery("#btn").mouseover(function(){
            alert("mouse passed on button");
        });
});

jQuery(document).ready(function(jQuery){
     jQuery("#keyboard").keypress(function(){
        alert("key pressed");
     });
});
/*
jQuery(document).ready(function(jQuery){
    jQuery("#keyboard").keyup(function(){
       console.log("key at up");
    });
});

jQuery(document).ready(function(jQuery){
    jQuery("#keyboard").keydown(function(){
       console.log("key at down");
    });
});
*/