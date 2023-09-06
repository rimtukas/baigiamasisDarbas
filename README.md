# Project Mohito
## Mohito
### Site used for testing
[mohito](https://mohito.com/)
### Packages used
- TestNG `org.testng:testng`
- Selenium `org.seleniumhq.selenium:selenium-java`
- WebDriverManager `io.github.bonigarcia:webdrivermanager`
## Test cases
### **Registration**
- Test 1 (registration)

*Registration with existing data*
1. Open main page 
2. Click on button 'Prisijungti' 
3. Input e-mail 
4. Input Name 
5. Input Surname 
6. Input password 
7. Click on button 'Sukurti paskyra'

Expected result: registration unsuccesful
### 
- Test 2 (changeMyAccountInformation)

*Change 'My account'  information by adding address *
1. Open page 'Mano paskyra'
2. Click button 'Adreso duomenys' 
3. Input street address 
4. Input Post code 
5. Input City 
6. Input mobile phone number 
7. Click on 'Issaugoti pakeitimus' button

Expected result: data insert correctly
- 
- Test 3 (Search results)

*Search different items*
1. Open main page
2. Input 'Kepure' in search window
3. Check search results

Expected result: search result show similar items

- Test 4 (Put items in collecting bag)

*Putting collected items in collecting bag*
1. Open main page
2. Input 'kelnes' in search window
3. Select item in search results
4. Select 'į krepšelį' button 
5. Check for selected item in pop-up window

Expected result: selected item appears in the collecting bag

- Test 5 (Search items in categories)

*Searching items in stock in sidebar categories*
1. Open main page 
2. Click on 'Drabuziai' category
3. Click on 'Svarkai' subcategory
4. Click on 'Neuzsegamas svarkas' item
5. Check on item availability in stock

Expected result: program shows item availability