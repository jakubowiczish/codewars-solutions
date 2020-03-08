/*
Assume "#" is like a backspace in string. This means that string "a#bc#d" actually is "bd"

Your task is to process a string with "#" symbols.

Examples
"abc#d##c"      ==>  "ac"
"abc##d######"  ==>  ""
"#######"       ==>  ""
""              ==>  ""
 */

function cleanString(s) {
    const result = [];

    for (const c of s) {
        if (c === "#") {
            result.pop()
        } else {
            result.push(c)
        }
    }

    return result.join("")
}

function cleanString2(s) {
    return s.split('')
        .reduce((r, e) => e === '#'
            ? r.slice(0, -1)
            : r + e, '');
}