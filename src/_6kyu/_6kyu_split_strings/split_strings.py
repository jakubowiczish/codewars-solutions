"""
Complete the solution so that it splits the string
into pairs of two characters.
If the string contains an odd number of
characters then it should replace
the missing second character of the final pair
with an underscore ('_').

Examples:

solution('abc') # should return ['ab', 'c_']
solution('abcdef') # should return ['ab', 'cd', 'ef']
"""


def split_strings(s):
    list = [s[i:i + 2] for i in range(0, len(s), 2)]
    res = []
    for e in list:
        if len(e) == 2:
            res.append(e)
        else:
            res.append(e + '_')
    return res
