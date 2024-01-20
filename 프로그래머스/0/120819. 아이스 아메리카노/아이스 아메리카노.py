def solution(money):
    answer = []
    num = money // 5500
    left = money - (num * 5500)
    answer.append(num)
    answer.append(left)
    return answer