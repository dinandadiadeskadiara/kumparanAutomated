         
        
    public void emailandPasswordTest()
    {WebElement email = driver.findElement(By.name("email"));
         email.sendKeys("test7.lambdatest@gmail.com");
          
         WebElement password = driver.findElement(By.name("password"));
         password.sendKeys("Test@12345");
         signUp.click();         
         
	
         
         String expectedURL = "https://kumparan.com.com/email/verify";
         String actualURL = driver.getCurrentUrl();
         Assert.assertEquals(actualURL, expectedURL);
         
         String expectedTitle = "Verifikasi akun anda";
         String actualTitle = driver.getTitle();
         Assert.assertEquals(actualTitle, expectedTitle);
    }