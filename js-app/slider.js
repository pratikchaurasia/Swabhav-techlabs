(function() {
    document.getElementById("myRange").addEventListener("input",createButtons);
    createButtons();
    function createButtons(){
        var slider = document.getElementById("myRange").value;
        var output = document.getElementById("demo");
        output.innerHTML = slider;

        var buttonsbox=document.getElementById('buttonID');
        buttonsbox.innerHTML="";
        for(i=0;i<slider;i++){
            var button=document.createElement("button");
            document.getElementById('buttonID').appendChild(button);
        }    
    }
})();