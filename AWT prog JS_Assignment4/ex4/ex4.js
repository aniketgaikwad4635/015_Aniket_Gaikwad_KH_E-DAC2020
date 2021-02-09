
jQuery(document).ready(function(jQuery){
      jQuery("h1").click(function(){
        var h1text=jQuery("h1").text();
          alert(h1text);
      });
});
jQuery(document).ready(function(jQuery){
    jQuery("p").click(function(){
      var ptext=jQuery("p").text();
        alert(ptext);
    });
});
jQuery(document).ready(function(jQuery){
    jQuery("#divid").click(function(){
      var idtext=jQuery("#divid").text();
        alert(idtext);
    });
});
