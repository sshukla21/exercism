//
// This is only a SKELETON file for the 'Bob' exercise. It's been provided as a
// convenience to get you started writing code faster.
//

export const hey = (message) => {
    let message_without_whitespace = message.trim();
    console.log(message.trim());
    if (containsAlphabet(message_without_whitespace) && message.toUpperCase() === message) {
        return endsWithQuestionMark(message_without_whitespace) ? "Calm down, I know what I'm doing!" : "Whoa, chill out!";
    } else if (endsWithQuestionMark(message_without_whitespace))
        return "Sure.";
    else if (message_without_whitespace == "")
        return "Fine. Be that way!";
    return "Whatever.";
};

export const containsAlphabet = (message) => {
    if (/[a-zA-Z]/.test(message))
        return true;
    return false;
}

export const endsWithQuestionMark = (message) => {
    if (message.slice(-1) === '?')
        return true;
    return false;
}
