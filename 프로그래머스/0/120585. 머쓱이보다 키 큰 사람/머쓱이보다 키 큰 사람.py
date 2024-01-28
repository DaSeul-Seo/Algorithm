def solution(array, height):
    rst = []
    for i in array:
        if height < i:
            rst.append(i)
    
    return len(rst)