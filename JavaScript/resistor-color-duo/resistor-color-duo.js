//
// This is only a SKELETON file for the 'Resistor Color Duo' exercise. It's been provided as a
// convenience to get you started writing code faster.
//
let colormap = new Map();
colormap.set("black",0);
colormap.set("brown",1);
colormap.set("red",2);
colormap.set("orange",3);
colormap.set("yellow",4);
colormap.set("green",5);
colormap.set("blue",6);
colormap.set("violet",7);
colormap.set("grey",8);
colormap.set("white",9);
let tensplace = 10;
export const decodedValue = (colorList) => {
    return tensplace*colormap.get(colorList[0])+colormap.get(colorList[1]);
};
