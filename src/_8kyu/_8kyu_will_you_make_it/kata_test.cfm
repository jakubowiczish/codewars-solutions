// https://testbox.ortusbooks.com/
component extends="CodewarsBaseSpec" {
// Submitted solution is written to Solution.cfc
    function beforeAll(){
        SUT = createObject( 'Solution' );
    }

function run(){
    given( "Will you make it?", () => {
        when( "sample tests", () => {
            then( "Input of 50, 25, 2", () => expect( SUT.zeroFuel( 50, 25, 2 ) ).toBeTrue() );
                then( "Input of 100, 50, 1", () => expect( SUT.zeroFuel( 100, 50, 1 ) ).toBeFalse() );
            });
        });
    }
}