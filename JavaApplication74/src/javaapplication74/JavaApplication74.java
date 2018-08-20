  @Test
    public void GetCardsRestOwner() {
        baseURI = getProperty("RBA.Services.Cards.Rest");
        basePath = getProperty("restGetOwner");
        authentication =
                ntlm(getProperty("username"),
                        getProperty("password"),
                        null, getProperty("domain"));
        defaultParser = Parser.JSON;

        Response response = when().get();
        String jsonResponse = response.jsonPath().getString("number[11]");
        Assert.assertEquals("что проверяем", jsonResponse);
        System.out.println(jsonResponse);

    }
@Test
    public void PutBlockCardsRest(){
        baseURI = getProperty("RBA.Services.Cards.Rest");
        basePath = getProperty("PostBlockcardsRest");
        authentication =
                ntlm(getProperty("username"),
                        getProperty("password"),
                        null, getProperty("domain"));

        defaultParser = Parser.JSON;
        Response r = given()
                .contentType("application/json")
                .body("{" +
                        "\"blockTypeId\" :" + 5 +","+
                        " \"blockReasonId\":" + 23 +
                        "}")
                .when()
                .put();

        String body = r.getBody().asString();
        System.out.println("Response Body:\n " + body);
       

    }
