
$("#btn").click(function(){
    var login = $("#login").val();
    var pass = $("#pass").val();
    $.ajax({
        url: 'js/data.json',
        type: 'GET',
        success: function(data){
        for(var i  in data){
            if(data[i].login == login && data[i].pass == pass){
                document.write(data[i].name +" " + data[i].sname)
            }
        }
        },
    }); 
});


//JSON.stringify(user);// перетворює простий обєкт в JSON
//JSON.parse(user);//переробляє з JSON в script
/*
$.ajax({ //щоб спілкуватись з сервером. для асинхронної загрузки даних
    
    url: 'js/data.json',
    type: 'GET', //коли ми нічого не відправляєм на сервер, а лише хочемо отримати дані, data в цьому випадку не потрібна;
//    type: 'POST', //основна задача відправити щось на сервер. В цьому випадку success  не обов`язково;
//    data: 'name', // для GET не потрібно
    success: function(data){
        console.log(data);
    },
//    dataType: 'JSON', //тут ми вказуєм якого типу дані JSON, XML, HTML, script...
    error: function(err){ //видає помилку чому дані не прийшли, якщо код 200 все ок, 403 не достатньо прав, 500 проблема на стороні сервера,всі 400 проблема на стороні клієнта
        console.log(err);
    }
    //типи передачі даних POST, GET, DELETE(видалення даних), PUT(оновлення даних)
    
});
*/