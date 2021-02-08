/**
 * 
 */
const add = require('../function');
describe('測試add-1函數', ()=> {
  it('測試5+5預期10', ()=> {
    if (add(5, 5) !== 10) {
      throw new Error("兩數相加結果不為兩數和");
    }
  });
});

describe('測試add-2函數', ()=> {
  it('測試6+7預期13', ()=> {
	if (add(6, 7) !== 13) {
	  throw new Error("兩數相加結果不為兩數和");
	}
  });
});

describe('測試add-3函數', ()=> {
  it('測試6+7預期13', ()=> {
	if (add(6, 8) !== 13) {
		throw new Error("兩數相加結果不為兩數和");
	}
  });
});