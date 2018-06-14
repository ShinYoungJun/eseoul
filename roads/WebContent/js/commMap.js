function init(){
    if(document.getElementById){
        leftMenuLayer = document.getElementById("leftMenu");
        leftMenuLayer.style.left = 0;
        
        myDivLayer = document.getElementById("myDiv");
        myDivLayer.style.left = 260;
    
    }
}


function leftButtonClick()
{
	
  if(document.getElementById("leftButtonImg").src=='http://98.33.1.86:8088/img/mapImg/left_Button.gif')
  {
      document.getElementById("leftButtonImg").src ='/img/mapImg/right_Button.gif';
      ButtonLeft();
      MenuLeft();
      
  }else
  {
      document.getElementById("leftButtonImg").src ='/img/mapImg/left_Button.gif';
      ButtonRight();
      MenuRight();
  }
}


function ButtonRight(){  
    if(document.getElementById){
        if(parseInt(myDivLayer.style.left) < 260){
            myDivLayer.style.left = parseInt(myDivLayer.style.left) + 10 + "px";
            setTimeout("ButtonRight()",30);
        }
    }
}

function ButtonLeft(){
    if(document.getElementById){
        if(parseInt(myDivLayer.style.left) > 0){
            myDivLayer.style.left = parseInt(myDivLayer.style.left) - 10 + "px";
            setTimeout("ButtonLeft()",30);
        }
    }
}

function MenuRight(){  
    if(document.getElementById){
        if(parseInt(leftMenuLayer.style.left) < 0){
            leftMenuLayer.style.left = parseInt(leftMenuLayer.style.left) + 10 + "px";
            setTimeout("MenuRight()",30);
        }
    }
}

function MenuLeft(){
    if(document.getElementById){
        if(parseInt(leftMenuLayer.style.left) > -260){
            leftMenuLayer.style.left = parseInt(leftMenuLayer.style.left) - 10 + "px";
            setTimeout("MenuLeft()",30);
        }
    }
}