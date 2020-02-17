"""
Complete the solution so that the function will
break up camel casing, using a space between words.

Example

solution("camelCasing")  ==  "camel Casing"

"""

def break_camel_case(s):
    return ''.join(' ' + c if c.isupper() else c for c in s)