def solution(arr, delete_list):
    answer = []
    
    for i in arr:
        cnt = 0
        for j in delete_list:
            if (i == j):
                cnt += 1
        
        if (cnt == 0):
            answer.append(i)
    
    return answer