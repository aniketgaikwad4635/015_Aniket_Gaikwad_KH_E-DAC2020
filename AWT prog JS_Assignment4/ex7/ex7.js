

jQuery(document).ready(function(jQuery){
      jQuery("h1").click(function(){
          jQuery("h1").hide(function(){
            alert("hide all h1 headings");
          });
          
      });
});

jQuery(document).ready(function(jQuery){
    jQuery("div").mouseover(function(){        
          alert("mouse comes at top left area.");     
    });
});
