class Solution(object):
    def minRemoveToMakeValid(self, s):
        stack=[]
        lst=list(s)
        for i in range(0,len(lst)):
            if (lst[i]=='('):
                stack.append(i)
            elif (lst[i]==')'):
                if stack:
                    stack.pop()
                else:
                    lst[i]=''
        while stack:
            lst[stack.pop()]=''
        return ''.join(lst)
        