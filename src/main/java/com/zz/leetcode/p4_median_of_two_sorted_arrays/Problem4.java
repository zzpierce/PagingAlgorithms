package com.zz.leetcode.p4_median_of_two_sorted_arrays;

/**
 * @author pierce
 */
public class Problem4 {

    public static void main(String[] args) {
        Solution s = new Solution();

        int[] a = new int[]{1,2,3,4,6};
        int[] b = new int[]{};
        double ans = s.findMedianSortedArrays(a, b);
        System.out.println(ans);


        a = new int[]{1,2};
        b = new int[]{3,4};
        ans = s.findMedianSortedArrays(a, b);
        System.out.println(ans);

        a = new int[]{1};
        b = new int[]{3,4};
        ans = s.findMedianSortedArrays(a, b);
        System.out.println(ans);

        a = new int[]{};
        b = new int[]{3,4};
        ans = s.findMedianSortedArrays(a, b);
        System.out.println(ans);

        a = new int[]{};
        b = new int[]{3};
        ans = s.findMedianSortedArrays(a, b);
        System.out.println(ans);

        a = new int[]{2,3,4,5,6};
        b = new int[]{1};
        ans = s.findMedianSortedArrays(a, b);
        System.out.println(ans);

        a = new int[]{9,28,245,307,461,561,680,683,688,711,728,755,789,880,937,962,1154,1166,1179,1259,1315,1331,1459,1545,1638,1642,1652,1658,1670,1877,2002,2015,2046,2109,2159,2162,2180,2197,2316,2338,2372,2419,2423,2529,2628,2636,2745,2793,2818,2833,2962,3009,3016,3080,3170,3258,3270,3337,3362,3452,3693,3788,3802,3979,4044,4070,4074,4074,4353,4355,4439,4586,4626,4716,4719,4790,4887,4924,4925,4929,4992,5034,5051,5121,5121,5320,5336,5518,5615,5700,5700,5716,5751,5905,5911,5947,5997,6015,6045,6153,6180,6226,6256,6321,6321,6340,6588,6726,6735,6886,6955,6964,6980,6998,7007,7058,7150,7274,7293,7294,7341,7354,7359,7427,7433,7511,7593,7887,7943,8033,8217,8246,8248,8260,8270,8288,8307,8370,8398,8435,8446,8460,8505,8526,8565,8806,8824,8872,8904,8992,9035,9037,9048,9113,9115,9274,9316,9336,9432,9445,9466,9562,9582,9592,9803,9897,9924,9999,10015,10043,10149,10214,10260,10309,10320,10323,10350,10415,10510,10613,10671,10712,10726,10769,10824,10832,11015,11056,11059,11067,11082,11221,11268,11271,11299,11325,11327,11339,11377,11390,11440,11560,11656,11740,11756,11830,11839,11843,11882,11932,11934,11960,11962,12075,12141,12163,12190,12314,12327,12379,12420,12477,12511,12512,12724,12802,12843,12914,12952,12968,13006,13049,13073,13239,13298,13428,13471,13496,13592,13641,13659,13795,13812,13841,13885,13949,14043,14120,14150,14173,14230,14250,14278,14298,14441,14455,14456,14584,14671,14735,14889,14914,14946,14949,14978,14993,15175,15239,15280,15565,15577,15582,15637,15652,15699,15701,15772,15841,15844,15854,15936,16060,16141,16175,16182,16195,16241,16287,16370,16397,16461,16516,16718,16739,16752,16795,16859,16911,16943,17054,17062,17064,17065,17065,17091,17093,17101,17147,17186,17240,17265,17326,17473,17499,17518,17552,17610,17628,17655,17774,17821,17847,17854,17949,18012,18070,18086,18103,18122,18130,18249,18260,18442,18541,18569,18735,18778,18910,18976,18986,19023,19116,19140,19156,19183,19194,19217,19227,19252,19290,19311,19344,19414,19479,19524,19571,19633,19648,19651,19723,19728,19733,19756,19815,19853,19944,20042,20155,20208,20238,20246,20255,20382,20413,20438,20470,20583,20590,20611,20642,20715,20755,20919,20948,20958,21120,21210,21271,21351,21356,21380,21436,21496,21544,21640,21709,21721,21724,21733,21860,21879,21948,21953,21955,21992,21994,22028,22124,22128,22131,22191,22221,22225,22487,22548,22560,22640,22640,22643,22656,22691,22769,22928,22935,23001,23007,23011,23053,23080,23159,23165,23236,23243,23297,23425,23449,23480,23553,23565,23646,23673,23711,23816,23882,23882,24009,24020,24036,24175,24236,24262,24288,24322,24372,24416,24429,24668,24785,24828,24883,25008,25079,25107,25205,25470,25539,25569,25633,25709,25719,25817,25873,25953,26026,26049,26132,26139,26229,26338,26385,26473,26511,26536,26538,26635,26678,26754,26846,26884,26994,27015,27336,27424,27510,27536,27589,27701,27749,27810,27950,27989,27989,27991,28006,28028,28089,28137,28174,28193,28198,28257,28261,28363,28434,28466,28479,28531,28547,28586,28650,28696,28780,28816,28839,28855,29005,29108,29162,29240,29282,29335,29381,29384,29491,29573,29673,29677,29710,29938,29984,30051,30089,30108,30141,30177,30358,30396,30560,30584,30674,30675,30678,30828,30954,30994,31132,31193,31279,31346,31355,31466,31514,31595,31690,31843,31923,32060,32175,32230,32233,32241,32338,32370,32410,32456,32460,32601,32689,32761};
        b = new int[]{20,481,516,770,1063,1247,1275,1469,1681,1974,2093,2324,2440,2548,2553,2759,2990,3032,3578,3813,3869,4019,4713,4741,4744,4771,4777,4863,5009,5266,5307,5476,5549,5673,5740,5925,6049,6364,6455,6565,6706,7094,7129,7259,7347,7364,7578,7635,7791,7793,7837,7863,8046,8046,8346,8535,8655,8946,9079,9594,10638,10991,11110,11167,11603,11718,11857,11960,12057,12109,12240,12287,12412,12565,12610,12680,12701,12814,12907,13128,13170,13385,13493,13572,13640,13947,13986,14139,14173,14319,14382,14407,14473,14497,14949,15038,15056,15416,15523,15649,15921,16451,16542,16579,16723,16894,17010,17410,17452,17725,17925,18070,18298,18329,18438,18741,18808,19247,19330,19778,19875,20595,20631,20765,20782,20998,21135,21525,21576,21622,21755,21891,21920,22097,22196,22770,22791,22841,23024,23066,23074,23094,23509,23863,24014,24101,24194,24360,24426,24499,24523,26026,26036,26237,26282,26380,26399,26883,27276,27304,27464,27482,27531,27571,27693,27736,27948,27950,28015,28029,28034,28369,28484,28538,28610,28845,29019,29122,29142,29173,29251,29304,29342,29517,29595,29731,29750,29830,29961,29987,30053,30374,30398,30510,30633,30661,30748,31278,31310,31850,31919,32175,32239,32261,32433,32457,32504,32761};
        ans = s.findMedianSortedArrays(a, b);
        System.out.println(ans);
    }

}

class Solution {


    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int l1 = nums1.length;
        int l2 = nums2.length;
        if (l1 + l2 == 1) {
            if (l1 > 0) {
                return nums1[0];
            } else {
                return nums2[0];
            }
        }
        int aim = (l1 + l2) / 2;
        double ans = search(0, l1, aim, nums1, nums2);

        return ans;
    }

    private double search(int start, int end, int aim, int[] na, int[] nb) {
        int p = (start + end - 1) / 2;
        if (end == 0) {
            p = -1;
        }
        if (p > aim - 1) {
            p -= 1;
        }
        int pa = p;
        int pb = aim - pa - 2;

        if (pb > nb.length - 1) {
            return search(pa + 1, end, aim, na, nb);
        }
        if (pb < -1) {
            return search(start, pa, aim, na, nb);
        }

        if (pa < na.length - 1 && pb != -1) {
            if (nb[pb] > na[pa + 1]) {
                return search(pa + 1, end, aim, na, nb);
            }
        }

        if (pb < nb.length - 1 && pa != -1) {
            if (na[pa] > nb[pb + 1]) {
                return search(start, pa, aim, na, nb);
            }
        }

        int bigger = Integer.MIN_VALUE;
        if (pa != -1) {
            bigger = na[pa];
        }
        if (pb != -1) {
            bigger = bigger > nb[pb] ? bigger : nb[pb];
        }

        int smallNext = Integer.MAX_VALUE;
        if (pa < na.length - 1) {
            smallNext = na[pa + 1];
        }
        if (pb < nb.length - 1) {
            smallNext = smallNext < nb[pb + 1] ? smallNext : nb[pb + 1];
        }

        if ((na.length + nb.length) % 2 == 0) {
            return (bigger + smallNext) / 2.0;
        } else {
            return smallNext * 1.0;
        }
    }
}