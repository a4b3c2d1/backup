
function getLoginMemory(login) {
  coktxt = document.cookie+";";
  stano = coktxt.indexOf(login);
  if (stano != -1){
    endno = coktxt.indexOf(";",stano);
    id = unescape(coktxt.substring(stano+login.length+1,endno));
  }else{
    id = "";
  }
  return id;
}


function setLoginMemory(login) {
  id = document.memory['loginUserId'].value;
  day0 = new Date();
  day0.setTime(day0.getTime()+60*60*24*1000);
  endday = day0.toGMTString();
  document.cookie = login+"="+escape(id)+";expires="+endday;
}

