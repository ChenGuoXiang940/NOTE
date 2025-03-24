library verilog;
use verilog.vl_types.all;
entity CONCATENATION_vlg_check_tst is
    port(
        HIGH_NIBBLE     : in     vl_logic_vector(3 downto 0);
        LEFT            : in     vl_logic_vector(7 downto 0);
        LOW_BIBBLE      : in     vl_logic_vector(3 downto 0);
        RIGHT           : in     vl_logic_vector(7 downto 0);
        SWAP            : in     vl_logic_vector(7 downto 0);
        WORD            : in     vl_logic_vector(15 downto 0);
        sampler_rx      : in     vl_logic
    );
end CONCATENATION_vlg_check_tst;
