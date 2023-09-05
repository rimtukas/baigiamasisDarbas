# Project Puiki
## Setup
### Site used for testing
[puiki](https://puiki.lt/)
### Packages used
- TestNG `org.testng:testng`
- Selenium `org.seleniumhq.selenium:selenium-java`
- WebDriverManager `io.github.bonigarcia:webdrivermanager`
## Test cases
### **Login**
- Test 1 (logIn)

*Log in with existing data*
1. Open main page 
2. Click on button 'Prisijungti'
3. Input Name
4. Input Surname
5. Input e-mail
6. Re-input e-mail
7. Input password
8. Re-input password
9. Click on button 'Išsaugoti informaciją'

Expected result: login succesful
### 
- Test 2 (changeMyAccountInformation)

*Change 'My account'  information by adding address *
1. Open page 'Mano paskyra'
2. Click button 'Pridėti adresą'
3. Click button 'add new address'
4. Input Name
5. Input Surname
6. Input address
7. Choose country
8. Input Post code
9. Input City
10. Input Phone number
11. Input mobile phone number
12. Click on 'Atnaujinti duomenis' button

Expected result: data insert correctly
- 
- Test 3 (Search results)

*Search different items*
1. Open main page
2. Input 'usb jungtis' in search window
3. Check search results

Expected result: search result show different items

- Test 4 (Put items in collecting bag)

*Putting collected items in collecting bag*
1. Open main page
2. Input 'peilis' in search window
3. Select item in search results
4. Select 'į krepšelį' button
5. Click on 'Krepšelis' button
6. Check for selected item in opened window

Expected result: selected item appears in the collecting bag

- Test 5 (Search items in categories)

*Searching items in stock in sidebar categories*
1. Open main page 
2. Click on 'Automobiliui' category
3. Click on 'Visos prekės' subcategory
4. Click on 'Lipdukas Žemaitija' item
5. Check on item availability in stock

Expected result: program shows item availability