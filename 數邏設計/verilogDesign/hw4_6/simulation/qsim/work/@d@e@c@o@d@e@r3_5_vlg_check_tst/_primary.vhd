library verilog;
use verilog.vl_types.all;
entity DECODER3_5_vlg_check_tst is
    port(
        Y               : in     vl_logic_vector(4 downto 0);
        sampler_rx      : in     vl_logic
    );
end DECODER3_5_vlg_check_tst;
