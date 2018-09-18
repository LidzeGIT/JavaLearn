@Дано("^я авторизовался в системе \\\"([^\\\"]*)\\\" и выполнил метод \\\"([^\\\"]*)\\\"$")
    public void authentication(String URI, String path){
        baseURI = URI;
        basePath = path;
        authentication = ntlm(getProperty("username"),
                getProperty("password"),
                null, getProperty("domain"));
    }

    @Тогда("^я выполняю метод GET$")
    public void getAssert(){
        response = when().get();
    }

    @Тогда("^я провожу блокировку с телом:")
    public void putBlock(String jsons){
        response = given().contentType("application/json").body(jsons).when().put();
    }
    @Тогда("^я делаю проверку что тело \"([^\"]*)\" равно \"([^\"]*)\"$")
    public void asserts(String path, String asserts){
        jsonResponse = response.jsonPath().getString(path);
        Assert.assertEquals(asserts,jsonResponse);
    }
