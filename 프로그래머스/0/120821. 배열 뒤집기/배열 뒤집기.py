def solution(num_list):
    answer = []
    for num in range(len(num_list) // 2):
        chIdx = len(num_list) - num - 1
        
        temp = num_list[num]
        num_list[num] = num_list[chIdx]
        num_list[chIdx] = temp
        
    answer = num_list
    return answer