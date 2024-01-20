def solution(n):
    answer = 0
    for num in range(0, n + 1, 2):
        if (num == 1 or num == 0):
            continue
        answer += num
    return answer