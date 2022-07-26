//
// This is only a SKELETON file for the 'RNA Transcription' exercise. It's been provided as a
// convenience to get you started writing code faster.
//

export const toRna = (dna) => {
  let toRNAmap = new Map();
  toRNAmap.set('G','C');
  toRNAmap.set('C','G');
  toRNAmap.set('T','A');
  toRNAmap.set('A','U');
  let RNA = "";
  for(let i=0;i<dna.length;i++){
         RNA += toRNAmap.get(dna[i]);
  }
  return RNA;
};
