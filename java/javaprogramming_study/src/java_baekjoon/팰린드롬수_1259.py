while True:
    num=input()
    if num=='0': #0이면 종료
        break
    if num==num[::-1]: #거꾸로 문자열 나열한거랑 같으면 yes 
        print('yes')
    elif num!=num[::-1]:#아니면 no
        print('no')
   
    
   
        
    