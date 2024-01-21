def solution(num_list):
    answer = []
    one = []
    two = []
    for n in num_list:
        if (n % 2 == 0):
            two.append(n)
        else:
            one.append(n)
            
    answer.append(len(two))
    answer.append(len(one))
    return answer